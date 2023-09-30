package dao;

import apoio.ConexaoBD;
import entidade.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Daniel
 */
public class UsuarioDAO {
    
    public boolean salvar(Usuario usuario) {

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "insert into usuario values ("
                    + "default,"
                    + "'"+ usuario.getNomeUsuario()+"',"
                    + "'"+ usuario.getSenhaUsuario()+"');";

            System.out.println(sql);
            
            st.executeUpdate(sql);
            return true;

        } catch (SQLException e) {
            System.out.println("Erro ao salvar usuário: " + e);
            return false;
        }
    }
    
    public boolean autenticarLogin(String usuarioDigitado, String senhaDigitada){
        
        Usuario u = this.consultarUsuario(usuarioDigitado);
        
        if (u.getNomeUsuario() == null) {
            return false;
        } else if (u.getNomeUsuario().equals(usuarioDigitado) 
                && u.getSenhaUsuario().equals(senhaDigitada)) {
            return true;            
        } else {
            return false;
        }
    }
    
    public Usuario consultarUsuario (String usuario) {
        
        Usuario u = new Usuario();
        
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "select * from usuario where nome = '" + usuario + "';";
            
            ResultSet resultado = st.executeQuery(sql);
            resultado.next();
            u.setNomeUsuario(resultado.getString("nome"));
            u.setSenhaUsuario(resultado.getString("senha"));
        } catch (SQLException e) {
            System.out.println("Erro ao consultar o login: " + e);
        }
        return u;
    }
}