package dao;

import apoio.ConexaoBD;
import apoio.IDAOT;
import entidade.Fornecedor;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import prompts.Prompts;

/**
 *
 * @author Daniel
 */
public class FornecedorDAO implements IDAOT<Fornecedor>{
    
    @Override
    public boolean validarCampos(Fornecedor fornecedor){
        if (fornecedor.getNome().equals("") || 
                fornecedor.getEmail().equals("") || 
                fornecedor.getTelefone().equals("") ||
                fornecedor.getCnpj().equals("")) {
            Prompts.promptAlerta("Preencha todos os campos!");
            return false;
        }
        return true;    
    }
   
    @Override
    public String insert(Fornecedor fornecedor) {
        try {
            Statement statement = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "insert into fornecedor values ("
                    + "default, '" + 
                    fornecedor.getNome() + "', '"+
                    fornecedor.getEmail() + "', '" + 
                    fornecedor.getTelefone() + "', '" + 
                    fornecedor.getCnpj() +"')";
            
            int retorno = statement.executeUpdate(sql);
            
            Prompts.promptInfo("Fornecedor salvo com sucesso!");
            return null;
        } catch(Exception e) {
            Prompts.promptErro("Erro ao inserir fornecedor. Verifique o log." + fornecedor.getId());
            System.out.println(e.getMessage());
            return e.getMessage();
        }        
    }
    
    @Override
    public String update(Fornecedor fornecedor) {
        try {
            Statement statement = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "update fornecedor set "
                    + "nome = '"+ fornecedor.getNome() + "',"
                    + "email = '" + fornecedor.getEmail() + "', "
                    + "telefone = '" + fornecedor.getTelefone() + "', "
                    + "cnpj = '" + fornecedor.getCnpj() + "' "
                    + "where id = " + fornecedor.getId();
            
            Prompts.promptInfo("Fornecedor atualizado com sucesso.");
            
            int retorno = statement.executeUpdate(sql);
            
            return null;
        } catch(Exception e) {
            Prompts.promptErro("Erro ao atualizar fornecedor. Verique o log.");
            System.out.println("Erro: " + e.getMessage());
            return e.getMessage();
        }
    }

    @Override
    public String delete(int id) {
        try {
            Statement statement = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "delete from fornecedor where id = " + id;
            
            Prompts.promptInfo("Fornecedor excluído com sucesso.");
            
            int retorno = statement.executeUpdate(sql);
            
            return null;
        } catch(Exception e) {
            Prompts.promptErro("Erro ao excluir fornecedor. Verique o log.");
            System.out.println("Erro: " + e.getMessage());
            return e.getMessage();
        }
    }
    
    @Override
    public ArrayList<Fornecedor> consultarTodos() {
        
        ArrayList<Fornecedor> fornecedores = new ArrayList();
        
        try {
            Statement statement = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "select * from fornecedor order by nome";
            
            ResultSet retorno = statement.executeQuery(sql);
            
            while (retorno.next()) {
                Fornecedor fornecedor = new Fornecedor();
                
                fornecedor.setId(retorno.getInt("id"));
                fornecedor.setNome(retorno.getString("nome"));
                fornecedor.setEmail(retorno.getString("email"));
                fornecedor.setTelefone(retorno.getString("telefone"));
                fornecedor.setCnpj(retorno.getString("cnpj"));
                
                fornecedores.add(fornecedor);
            }
            
        } catch (Exception e) {
            Prompts.promptErro("Erro ao consultar os fornecedores. Verifique o log.");
            System.out.println("Ocorreu o seguinte erro ao consultar os fornecedores: " + e.getMessage());
        }
        return fornecedores;
    }
    
    @Override
    public ArrayList<Fornecedor> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Fornecedor consultarId(int id) {
        
        Fornecedor fornecedor = null;
        
        try {
            Statement statement = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "select * from fornecedor where id=" + id;
            
            ResultSet retorno = statement.executeQuery(sql);
            
            while (retorno.next()) {
                fornecedor = new Fornecedor();
                
                fornecedor.setId(retorno.getInt("id"));
                fornecedor.setNome(retorno.getString("nome"));
                fornecedor.setEmail(retorno.getString("email"));
                fornecedor.setTelefone(retorno.getString("telefone"));
                fornecedor.setCnpj(retorno.getString("cnpj"));
            }
            
        } catch (Exception e) {
            Prompts.promptErro("Erro ao consultar o fornecedor de código: " + id + ". Verifique o log.");
            System.out.println("Erro: " + e.getMessage());
        }
        return fornecedor;
    }
    
    public void preencherTabela (JTable tabela, String criterio) {
        ResultSet resultadoQ;
        
        Object[][] dadosTabela = null;
        
        Object[] coluna = new Object[5];
        coluna[0] = "Código";
        coluna[1] = "Nome";
        coluna[2] = "Email";
        coluna[3] = "Telefone";
        coluna[4] = "CNPJ";
        
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "select count(*) "
                    + "from fornecedor "
                    + "where nome like '%" + criterio + "%'");
            resultadoQ.next();
            
            dadosTabela = new Object[resultadoQ.getInt(1)][5];
        } catch (Exception e) {
            Prompts.promptErro("Erro ao criar a tabela de fornecedores. Verifique o log.");
            System.out.println("Erro: " + e.getMessage());
        }
        
        int linha = 0;
        
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "select * "
                    + "from fornecedor "
                    + "where nome like '%" + criterio + "%'");
            
            while (resultadoQ.next()) {
                dadosTabela[linha][0] = resultadoQ.getInt("id");
                dadosTabela[linha][1] = resultadoQ.getString("nome");
                dadosTabela[linha][2] = resultadoQ.getString("email");
                dadosTabela[linha][3] = resultadoQ.getString("telefone");
                dadosTabela[linha][4] = resultadoQ.getString("cnpj");
                linha++;
                
            }
        } catch (Exception e) {
            Prompts.promptErro("Erro ao preencher dados da tabela. Verifique o log.");
            System.out.println("Erro: " + e);
        }
        
        //Bloqueando campos da tabela
        tabela.setModel(new DefaultTableModel(dadosTabela, coluna) {
                        
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            @Override
            public Class getColumnClass(int column) {
                return Object.class;
            }
        });
        
        //Permitido selecionar somente 1 linha da tabela
        tabela.setSelectionMode(0);
        
        //Redimensiona as colunas de uma tabela
        TableColumn column = null;
        for (int x = 0; x < tabela.getColumnCount(); x++) {
            column = tabela.getColumnModel().getColumn(x);
            switch (x) {
                case 0:
                    column.setPreferredWidth(30);
                    break;
                case 1:
                    column.setPreferredWidth(140);
                    break;
                case 2:
                    column.setPreferredWidth(140);
                    break;
                case 3:
                    column.setPreferredWidth(140);
                    break;
                case 4:
                    column.setPreferredWidth(140);
                    break;
            }
        }
    }
}