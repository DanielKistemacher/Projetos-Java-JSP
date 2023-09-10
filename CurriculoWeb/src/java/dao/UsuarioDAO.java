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
    
    public boolean autenticarLogin(String usuarioDigitado, String senhaDigitada){
        
        Usuario u = this.consultarUsuario(usuarioDigitado, senhaDigitada);
        
        if (u.getNomeUsuario().equals(usuarioDigitado) 
                && u.getSenhaUsuario().equals(senhaDigitada)) {
            return true;            
        } else {
            return false;
        }
    }
    
    public Usuario consultarUsuario (String usuario, String senha) {
        
        Usuario u = new Usuario();
        
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "select * from usuario where nome = '" + usuario + "';";
            
            ResultSet resultado = st.executeQuery(sql);
            
            while (resultado.next()) {
                u.setNomeUsuario(resultado.getString("nome"));
                u.setSenhaUsuario(resultado.getString("senha"));
            }
            
        } catch (SQLException e) {
            System.out.println("Erro ao consultar o login: " + e);
        }
        return u;
    }
}