package dao;

import apoio.ConexaoBD;
import entidade.Categoria;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class CategoriaDAO {
    
    public ArrayList consultarTodos () {
        
        ArrayList<Categoria> categorias = new ArrayList<>();
        
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "select * from categoria";
            
            ResultSet resultado = st.executeQuery(sql);
            
            while (resultado.next()) {
                Categoria ct = new Categoria();
                ct.setId(resultado.getInt("id"));
                ct.setDescricao(resultado.getString("descricao"));
                
                categorias.add(ct);
            }
            
        } catch (SQLException e) {
            System.out.println("Erro ao salvar cadastro: " + e);
        }
        
        return categorias;
    }
}