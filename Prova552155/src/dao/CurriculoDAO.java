package dao;

import apoio.ConexaoBD;
import apoio.IDAOT;
import apoio.Prompts;
import entidade.Curriculo;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Daniel
 */
public class CurriculoDAO implements IDAOT<Curriculo>{
    
    @Override
    public boolean validarCampos(Curriculo curriculo){
        if (curriculo.getNome().equals("") || 
                curriculo.getEmail().equals("") || 
                curriculo.getTelefone().equals("") ||
                curriculo.getEscolaridade().equals("") ||
                curriculo.getExp_profissionais().equals("") ||
                curriculo.getOutros().equals("")) {
            Prompts.promptAlerta("Preencha todos os campos!");
            return false;
        }
        return true;    
    }
    
    @Override
    public String insert(Curriculo curriculo) {
        try {
            Statement statement = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "insert into curriculo values ("
                    + "default, '" +
                    curriculo.getData_hora_cadastro() + "', '" +
                    curriculo.getNome() + "', '" +
                    curriculo.getEmail() + "', '" +
                    curriculo.getTelefone() + "', '" +
                    curriculo.getEscolaridade() + "', '" +
                    curriculo.getExp_profissionais()+ "', '" +
                    curriculo.getOutros() + "', '" +
                    curriculo.getSituacao() + "')";
            
            int retorno = statement.executeUpdate(sql);
            
            Prompts.promptInfo("Currículo cadastrado com sucesso!");
            return null;
            
        } catch (Exception e) {
            Prompts.promptErro("Erro ao inserir currículo. Verifique o log.");
            System.out.println(e.getMessage());
            return e.getMessage();
        }
    }
    
    @Override
    public String update(Curriculo curriculo) {
        try {
            Statement statement = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "update curriculo set "
                    + "data_hora_cadastro = '"+ curriculo.getData_hora_cadastro() + "', "
                    + "nome = '"+ curriculo.getNome() + "', "
                    + "e_mail = '" + curriculo.getEmail() + "', "
                    + "telefone = '" + curriculo.getTelefone() + "', "
                    + "escolaridade = '" + curriculo.getEscolaridade()+ "', "
                    + "experiencias_profissionais = '" + curriculo.getExp_profissionais()+ "', "
                    + "outros = '" + curriculo.getOutros()+ "', "
                    + "situacao = '" + curriculo.getSituacao()+ "' "
                    + "where id = " + curriculo.getId();
            System.out.println(sql);
            Prompts.promptInfo("Currículo atualizado com sucesso.");
            
            int retorno = statement.executeUpdate(sql);
            
            return null;
        } catch(Exception e) {
            Prompts.promptErro("Erro ao atualizar currículo. Verique o log.");
            System.out.println("Erro: " + e.getMessage());
            return e.getMessage();
        }
    }

    @Override
    public String delete(int id) {
        
        try {
            Statement statement = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "delete from curriculo where id = " + id;
            
            Prompts.promptInfo("Currículo excluído com sucesso.");
            
            int retorno = statement.executeUpdate(sql);
            
            return null;
        } catch(Exception e) {
            Prompts.promptErro("Erro ao excluir currículo. Verique o log.");
            System.out.println("Erro: " + e.getMessage());
            return e.getMessage();
        }
    }
    
    @Override
    public ArrayList<Curriculo> consultarTodos() {
        
        ArrayList<Curriculo> curriculos = new ArrayList();
        
        try {
            Statement statement = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "select * from curriculo order by nome";
            
            ResultSet retorno = statement.executeQuery(sql);
            
            while (retorno.next()) {
                Curriculo curriculo = new Curriculo();
                
                curriculo.setId(retorno.getInt("id"));
                curriculo.setNome(retorno.getString("nome"));
                curriculo.setEmail(retorno.getString("e_mail"));
                curriculo.setTelefone(retorno.getString("telefone"));
                curriculo.setEscolaridade(retorno.getString("escolaridade"));
                curriculo.setExp_profissionais(retorno.getString("experiencias_profissionais"));
                curriculo.setOutros(retorno.getString("outros"));
                curriculo.setSituacao(retorno.getString("situacao").charAt(0));                
                
                curriculos.add(curriculo);
            }
            
        } catch (Exception e) {
            Prompts.promptErro("Erro ao consultar os currículos. Verifique o log.");
            System.out.println("Erro: " + e.getMessage());
        }
        return curriculos;
    }
    
    @Override
    public ArrayList<Curriculo> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Curriculo consultarId(int id) {
        Curriculo curriculo = null;
        
        try {
            Statement statement = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "select * from curriculo where id=" + id;
            
            ResultSet retorno = statement.executeQuery(sql);
            
            while (retorno.next()) {
                curriculo = new Curriculo();
                
                curriculo.setId(retorno.getInt("id"));
                curriculo.setData_hora_cadastro(retorno.getString("data_hora_cadastro"));
                curriculo.setNome(retorno.getString("nome"));
                curriculo.setEmail(retorno.getString("e_mail"));
                curriculo.setTelefone(retorno.getString("telefone"));
                curriculo.setEscolaridade(retorno.getString("escolaridade"));
                curriculo.setExp_profissionais(retorno.getString("experiencias_profissionais"));
                curriculo.setOutros(retorno.getString("outros"));
                curriculo.setSituacao(retorno.getString("situacao").charAt(0));
            }
            
        } catch (Exception e) {
            Prompts.promptErro("Erro ao consultar o currículo de código: " + id + ". Verifique o log.");
            System.out.println("Erro: " + e.getMessage());
        }
        return curriculo;
    }
    
    public void preencherTabela (JTable tabela, String criterio) {
        ResultSet resultadoQ;
        
        Object[][] dadosTabela = null;
        
        Object[] coluna = new Object[9];
        coluna[0] = "Código";
        coluna[1] = "Data";
        coluna[2] = "Nome";
        coluna[3] = "E-mail";
        coluna[4] = "Telefone";
        coluna[5] = "Escolaridade";
        coluna[6] = "Exp. Profissional";
        coluna[7] = "Outros";
        coluna[8] = "Situação";
        
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "select count(*) "
                    + "from curriculo "
                    + "where nome like '%" + criterio + "%'");
            resultadoQ.next();
            
            dadosTabela = new Object[resultadoQ.getInt(1)][9];
        } catch (Exception e) {
            Prompts.promptErro("Erro ao criar a tabela de currículos. Verifique o log.");
            System.out.println("Erro: " + e.getMessage());
        }
        
        int linha = 0;
        
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "select * "
                    + "from curriculo "
                    + "where nome like '%" + criterio + "%'");
            
            while (resultadoQ.next()) {
                dadosTabela[linha][0] = resultadoQ.getInt("id");
                dadosTabela[linha][1] = resultadoQ.getString("data_hora_cadastro");
                dadosTabela[linha][2] = resultadoQ.getString("nome");
                dadosTabela[linha][3] = resultadoQ.getString("e_mail");
                dadosTabela[linha][4] = resultadoQ.getString("telefone");
                dadosTabela[linha][5] = resultadoQ.getString("escolaridade");
                dadosTabela[linha][6] = resultadoQ.getString("experiencias_profissionais");
                dadosTabela[linha][7] = resultadoQ.getString("outros");
                String situacao = resultadoQ.getString("situacao");
                if (situacao.equals("1")) {
                    dadosTabela[linha][8] = "Ativo";
                } else if (situacao.equals("0")) {
                    dadosTabela[linha][8] = "Inativo";
                }
                
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
