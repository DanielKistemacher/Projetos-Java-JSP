package dao;

/**
 *
 * @author Daniel
 */
import apoio.ConexaoBD;
import apoio.IDAOT;
import entidade.Usuario;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import prompts.Prompts;

/**
 *
 * @author Daniel
 */
public class UsuarioDAO implements IDAOT<Usuario>{
    
    @Override
    public boolean validarCampos(Usuario usuario){
        if (usuario.getNome().equals("") || 
                usuario.getEmail().equals("") || 
                usuario.getSenha().equals("")) {
            Prompts.promptAlerta("Preencha todos os campos!");
            return false;
        }
        return true;    
    }
    
    @Override
    public String insert(Usuario usuario) {
        try {
            Statement statement = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "insert into usuario values ("
                    + "default, '" + 
                    usuario.getNome() + "', '" + 
                    usuario.getEmail() + "', MD5('" + 
                    usuario.getSenha() + "'), 'a" + 
                    usuario.getSituacao() + "')";
            
            int retorno = statement.executeUpdate(sql);
            
            Prompts.promptInfo("Usuário cadastrado com sucesso.");
            return null;
            
        } catch (Exception e) {
            Prompts.promptErro("Erro ao inserir usuário. Verifique o log.");
            System.out.println(e.getMessage());
            return e.getMessage();
        }
    }
    
    @Override
    public String update(Usuario usuario) {
        try {
            Statement statement = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "update usuario set "
                    + "nome = '"+ usuario.getNome() + "',"
                    + "email = '" + usuario.getEmail() + "', "
                    + "senha = '" + usuario.getSenha() + "', "
                    + "situacao = '" + usuario.getSituacao() + "' "
                    + "where id = " + usuario.getId();
            
            Prompts.promptInfo("Usuário atualizado com sucesso.");
            
            int retorno = statement.executeUpdate(sql);
            
            return null;
        } catch(Exception e) {
            Prompts.promptErro("Erro ao atualizar usuário. Verique o log.");
            System.out.println("Erro: " + e.getMessage());
            return e.getMessage();
        }
    }

    @Override
    public String delete(int id) {
        
        try {
            Statement statement = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "delete from usuario where id = " + id;
            
            Prompts.promptInfo("Usuário excluído com sucesso.");
            
            int retorno = statement.executeUpdate(sql);
            
            return null;
        } catch(Exception e) {
            Prompts.promptErro("Erro ao excluir usuário. Verique o log.");
            System.out.println("Erro: " + e.getMessage());
            return e.getMessage();
        }
    }
    
    @Override
    public ArrayList<Usuario> consultarTodos() {
        
        ArrayList<Usuario> usuarios = new ArrayList();
        
        try {
            Statement statement = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "select * from usuario order by nome";
            
            ResultSet retorno = statement.executeQuery(sql);
            
            while (retorno.next()) {
                Usuario usuario = new Usuario();
                
                usuario.setId(retorno.getInt("id"));
                usuario.setNome(retorno.getString("nome"));
                usuario.setEmail(retorno.getString("email"));
                usuario.setSenha(retorno.getString("senha"));
                usuario.setSituacao('a');
                
                usuarios.add(usuario);
            }
            
        } catch (Exception e) {
            Prompts.promptErro("Erro ao consultar os clientes. Verifique o log.");
            System.out.println("Erro: " + e.getMessage());
        }
        return usuarios;
    }
    
    @Override
    public ArrayList<Usuario> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario consultarId(int id) {
        Usuario usuario = null;
        
        try {
            Statement statement = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "select * from usuario where id=" + id;
            
            ResultSet retorno = statement.executeQuery(sql);
            
            while (retorno.next()) {
                usuario = new Usuario();
                
                usuario.setId(retorno.getInt("id"));
                usuario.setNome(retorno.getString("nome"));
                usuario.setEmail(retorno.getString("email"));
                usuario.setSenha(retorno.getString("senha"));
                usuario.setSituacao('a');
            }
            
        } catch (Exception e) {
            Prompts.promptErro("Erro ao consultar o usuário de código: " + id + ". Verifique o log.");
            System.out.println("Erro: " + e.getMessage());
        }
        return usuario;
    }
    
    public boolean autenticar(Usuario usuario) {

        try {
            String sql
                    = "SELECT email, senha "
                    + "FROM usuario "
                    + "WHERE "
                    + "email = '" + usuario.getEmail() + "'  and "
                    + "senha = md5 ('" + usuario.getSenha() + "') and "
                    + "situacao = 'a'";

            ResultSet resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);

            if (resultadoQ.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            Prompts.promptErro("Erro ao autenticar usuário: " + e);
            return false;
        }
    }    
}