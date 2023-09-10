package dao;

import apoio.ConexaoBD;
import apoio.IDAOT;
import entidade.Endereco;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import prompts.Prompts;

/**
 *
 * @author Daniel
 */
public class EnderecoDAO implements IDAOT<Endereco> {
    @Override
    public boolean validarCampos(Endereco endereco){
        if (endereco.getDescricao().equals("") || 
                endereco.getCep().equals("")) {
            Prompts.promptAlerta("Preencha todos os campos!");
            return false;
        }
        return true;    
    }
    
    @Override
    public String insert(Endereco endereco) {
        try {
            Statement statement = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "insert into endereco values ("
                    + "default, '" + 
                    endereco.getDescricao() + "', '" + 
                    endereco.getCep() + "')";
            
            int retorno = statement.executeUpdate(sql);
            
            Prompts.promptInfo("Endereço cadastrado com sucesso.");
            return null;
            
        } catch (Exception e) {
            Prompts.promptErro("Erro ao inserir endereço. Verifique o log.");
            System.out.println(e.getMessage());
            return e.getMessage();
        }
    }
    
    @Override
    public String update(Endereco endereco) {
        try {
            Statement statement = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "update endereco set "
                    + "descricao = '"+ endereco.getDescricao() + "',"
                    + "cep = '" + endereco.getCep() + "'";
            
            Prompts.promptInfo("Endereço atualizado com sucesso.");
            
            int retorno = statement.executeUpdate(sql);
            
            return null;
        } catch(Exception e) {
            Prompts.promptErro("Erro ao atualizar endereço. Verique o log.");
            System.out.println("Erro: " + e.getMessage());
            return e.getMessage();
        }
    }

    @Override
    public String delete(int id) {
        try {
            Statement statement = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "delete from endereco where id = " + id;
            
            Prompts.promptInfo("Endereço excluído com sucesso.");
            
            int retorno = statement.executeUpdate(sql);
            
            return null;
        } catch(Exception e) {
            Prompts.promptErro("Erro ao excluir endereço. Verique o log.");
            System.out.println("Erro: " + e.getMessage());
            return e.getMessage();
        }
    }
    
    @Override
    public ArrayList<Endereco> consultarTodos() {
        
        ArrayList<Endereco> enderecos = new ArrayList();
        
        try {
            Statement statement = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "select * from endereco order by nome";
            
            ResultSet retorno = statement.executeQuery(sql);
            
            while (retorno.next()) {
                Endereco endereco = new Endereco();
                
                endereco.setId(retorno.getInt("id"));
                endereco.setDescricao(retorno.getString("descricao"));
                endereco.setCep(retorno.getString("cep"));
                
                enderecos.add(endereco);
            }
            
        } catch (Exception e) {
            Prompts.promptErro("Erro ao consultar os endereços. Verifique o log.");
            System.out.println("Erro: " + e.getMessage());
        }
        return enderecos;
    }
    
    @Override
    public ArrayList<Endereco> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Endereco consultarId(int id) {
        Endereco endereco = null;
        
        try {
            Statement statement = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "select * from endereco where id=" + id;
            
            ResultSet retorno = statement.executeQuery(sql);
            
            while (retorno.next()) {
                endereco = new Endereco();
                
                endereco.setId(retorno.getInt("id"));
                endereco.setDescricao(retorno.getString("descricao"));
                endereco.setCep(retorno.getString("cep"));
            }
            
        } catch (Exception e) {
            Prompts.promptErro("Erro ao consultar o endereco de código: " + id + ". Verifique o log.");
            System.out.println("Erro: " + e.getMessage());
        }
        return endereco;
    }
    
    public void preencherTabela(JTable tabela, String criterio) {
        ResultSet resultadoQ;
        
        Object[][] dadosTabela = null;
        
        Object[] coluna = new Object[3];
        coluna[0] = "Código";
        coluna[1] = "Descrição";
        coluna[2] = "CEP";
        
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "select count(*) "
                    + "from endereco "
                    + "where descricao like '%" + criterio + "%'");
            resultadoQ.next();
            
            dadosTabela = new Object[resultadoQ.getInt(1)][3];
        } catch (Exception e) {
            Prompts.promptErro("Erro ao criar a tabela de endereços. Verifique o log.");
            System.out.println("Erro: " + e.getMessage());
        }
        
        int linha = 0;
        
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "select * "
                    + "from endereco "
                    + "where descricao like '%" + criterio + "%'");
            
            while (resultadoQ.next()) {
                dadosTabela[linha][0] = resultadoQ.getInt("id");
                dadosTabela[linha][1] = resultadoQ.getString("descricao");
                dadosTabela[linha][2] = resultadoQ.getString("cep");
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
                    column.setPreferredWidth(250);
                    break;
                case 2:
                    column.setPreferredWidth(30);
                    break;
            }
        }
    }
}