package dao;

import apoio.ConexaoBD;
import entidade.Pessoa;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class PessoaDAO {
    
    public boolean salvar(Pessoa pessoa) {
        
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "insert into pessoa values ("
                    + "default,"
                    + "'"+ pessoa.getNomePessoa() +"',"
                    + "'"+ pessoa.getEmailPessoa() +"',"
                    + "'"+ pessoa.getTelefonePessoa() +"',"
                    + "'"+ pessoa.getDataNascimento() +"'"
                    + ")";
            
            st.executeUpdate(sql);
            return true;
            
        } catch (SQLException e) {
            System.out.println("Erro ao salvar cadastro: " + e);
            return false;
        }
    }
    
    public boolean atualizar(Pessoa pessoa) {
        
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "update pessoa set "
                    + "nome = '" + pessoa.getNomePessoa() +"',"
                    + "email = '"+ pessoa.getEmailPessoa() +"',"
                    + "telefone = '"+ pessoa.getTelefonePessoa() +"',"
                    + "data_nascimento = '"+ pessoa.getDataNascimento() +"'"
                    + " where id = " + pessoa.getIdPessoa();
            
            st.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar cadastro: " + e);
            return false;
        }
    }
    
    public boolean excluir(int codigo) {
        
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "delete from pessoa where id= " + codigo;
            
            st.executeUpdate(sql);
            return true;
            
        } catch (SQLException e) {
            System.out.println("Erro ao excluir cadastro: " + e);
            return false;
        }
    }
    
    public ArrayList consultarTodos () {
        
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "select * from pessoa";
            
            ResultSet resultado = st.executeQuery(sql);
            
            while (resultado.next()) {
                Pessoa p = new Pessoa();
                p.setIdPessoa(resultado.getInt("id"));
                p.setNomePessoa(resultado.getString("nome"));
                p.setEmailPessoa(resultado.getString("email"));
                p.setTelefonePessoa(resultado.getString("telefone"));
                p.setDataNascimento(resultado.getString("data_nascimento"));
                
                pessoas.add(p);
            }
            
        } catch (SQLException e) {
            System.out.println("Erro ao salvar cadastro: " + e);
        }
        
        return pessoas;
    }
    
     public Pessoa consultarPessoaId (int idPessoa) {
        
        Pessoa p = new Pessoa();
        
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "select * from pessoa where id = '" + idPessoa + "';";
            
            ResultSet resultado = st.executeQuery(sql);
            
            resultado.next();
                p.setIdPessoa(resultado.getInt("id"));
                p.setNomePessoa(resultado.getString("nome"));
                p.setEmailPessoa(resultado.getString("email"));
                p.setTelefonePessoa(resultado.getString("telefone"));
                p.setDataNascimento(resultado.getString("data_nascimento"));
        } catch (SQLException e) {
            System.out.println("Erro ao consultar o cadastro de pessoa: " + e);
        }
        return p;
    }
}