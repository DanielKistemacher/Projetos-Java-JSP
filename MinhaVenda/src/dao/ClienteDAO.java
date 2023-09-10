package dao;

import apoio.ConexaoBD;
import apoio.IDAOT;
import java.sql.Statement;
import entidade.Cliente;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import prompts.Prompts;

/**
 *
 * @author Daniel
 */
public class ClienteDAO implements IDAOT<Cliente>{
    
    @Override
    public boolean validarCampos(Cliente cliente){
        if (cliente.getNome().equals("") || 
                cliente.getEmail().equals("") || 
                cliente.getTelefone().equals("") ||
                cliente.getCpf().equals("")) {
            Prompts.promptAlerta("Preencha todos os campos!");
            return false;
        }
        return true;    
    }
    
    @Override
    public String insert(Cliente cliente) {
        try {
            Statement statement = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "insert into cliente values ("
                    + "default, '" + 
                    cliente.getNome() + "', '" + 
                    cliente.getEmail() + "', '" + 
                    cliente.getCpf() + "', '" + 
                    cliente.getTelefone() + "')";
            
            int retorno = statement.executeUpdate(sql);
            
            Prompts.promptInfo("Cliente cadastrado com sucesso.");
            return null;
            
        } catch (Exception e) {
            Prompts.promptErro("Erro ao inserir cliente. Verifique o log.");
            System.out.println(e.getMessage());
            return e.getMessage();
        }
    }
    
    @Override
    public String update(Cliente cliente) {
        try {
            Statement statement = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "update cliente set "
                    + "nome = '"+ cliente.getNome() + "',"
                    + "email = '" + cliente.getEmail() + "', "
                    + "telefone = '" + cliente.getTelefone() + "', "
                    + "cpf = '" + cliente.getCpf() + "' "
                    + "where id = " + cliente.getId();
            
            Prompts.promptInfo("Cliente atualizado com sucesso.");
            
            int retorno = statement.executeUpdate(sql);
            
            return null;
        } catch(Exception e) {
            Prompts.promptErro("Erro ao atualizar cliente. Verique o log.");
            System.out.println("Erro: " + e.getMessage());
            return e.getMessage();
        }
    }

    @Override
    public String delete(int id) {
        
        try {
            Statement statement = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "delete from cliente where id = " + id;
            
            Prompts.promptInfo("Cliente excluído com sucesso.");
            
            int retorno = statement.executeUpdate(sql);
            
            return null;
        } catch(Exception e) {
            Prompts.promptErro("Erro ao excluir cliente. Verique o log.");
            System.out.println("Erro: " + e.getMessage());
            return e.getMessage();
        }
    }
    
    @Override
    public ArrayList<Cliente> consultarTodos() {
        
        ArrayList<Cliente> clientes = new ArrayList();
        
        try {
            Statement statement = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "select * from cliente order by nome";
            
            ResultSet retorno = statement.executeQuery(sql);
            
            while (retorno.next()) {
                Cliente cliente = new Cliente();
                
                cliente.setId(retorno.getInt("id"));
                cliente.setNome(retorno.getString("nome"));
                cliente.setEmail(retorno.getString("email"));
                cliente.setCpf(retorno.getString("cpf"));
                cliente.setTelefone(retorno.getString("telefone"));
                
                clientes.add(cliente);
            }
            
        } catch (Exception e) {
            Prompts.promptErro("Erro ao consultar os clientes. Verifique o log.");
            System.out.println("Erro: " + e.getMessage());
        }
        return clientes;
    }
    
    @Override
    public ArrayList<Cliente> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente consultarId(int id) {
        Cliente cliente = null;
        
        try {
            Statement statement = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "select * from cliente where id=" + id;
            
            ResultSet retorno = statement.executeQuery(sql);
            
            while (retorno.next()) {
                cliente = new Cliente();
                
                cliente.setId(retorno.getInt("id"));
                cliente.setNome(retorno.getString("nome"));
                cliente.setEmail(retorno.getString("email"));
                cliente.setTelefone(retorno.getString("telefone"));
                cliente.setCpf(retorno.getString("cpf"));
            }
            
        } catch (Exception e) {
            Prompts.promptErro("Erro ao consultar o cliente de código: " + id + ". Verifique o log.");
            System.out.println("Erro: " + e.getMessage());
        }
        return cliente;
    }
    
    public void preencherTabela (JTable tabela, String criterio) {
        ResultSet resultadoQ;
        
        Object[][] dadosTabela = null;
        
        Object[] coluna = new Object[5];
        coluna[0] = "Código";
        coluna[1] = "Nome";
        coluna[2] = "Email";
        coluna[3] = "CPF";
        coluna[4] = "Telefone";
        
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "select count(*) "
                    + "from cliente "
                    + "where nome like '%" + criterio + "%'");
            resultadoQ.next();
            
            dadosTabela = new Object[resultadoQ.getInt(1)][5];
        } catch (Exception e) {
            Prompts.promptErro("Erro ao criar a tabela de clientes. Verifique o log.");
            System.out.println("Erro: " + e.getMessage());
        }
        
        int linha = 0;
        
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "select * "
                    + "from cliente "
                    + "where nome like '%" + criterio + "%'");
            
            while (resultadoQ.next()) {
                dadosTabela[linha][0] = resultadoQ.getInt("id");
                dadosTabela[linha][1] = resultadoQ.getString("nome");
                dadosTabela[linha][2] = resultadoQ.getString("email");
                dadosTabela[linha][3] = resultadoQ.getString("cpf");
                dadosTabela[linha][4] = resultadoQ.getString("telefone");
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