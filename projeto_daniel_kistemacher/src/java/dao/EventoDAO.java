package dao;

import apoio.ConexaoBD;
import entidade.Evento;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class EventoDAO {
    
    public boolean salvar(Evento evento) {
        
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "insert into evento values ("
                    + "default,"
                    + "'"+ evento.getNome_evento() +"',"
                    + evento.getCategoria_id() + ","
                    + "'"+ evento.getData_evento()+"',"
                    + evento.getValor_custo_evento()+","
                    + "'"+ evento.getObservacoes()+"'"
                    + ")";
            
            st.executeUpdate(sql);
            return true;
            
        } catch (SQLException e) {
            System.out.println("Erro ao salvar cadastro: " + e);
            return false;
        }
    }
    
    public boolean atualizar(Evento evento) {
        
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "update evento set "
                    + "nome_evento = '" + evento.getNome_evento() +"',"
                    + "categoria_id = "+ evento.getCategoria_id() +","
                    + "data_evento = '"+ evento.getData_evento() +"',"
                    + "valor_custo_evento = "+ evento.getValor_custo_evento() +","
                    + "observacoes = '"+ evento.getObservacoes() +"'"
                    + " where id = " + evento.getId_evento();
            
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
            
            String sql = "delete from evento where id= " + codigo;
            
            st.executeUpdate(sql);
            return true;
            
        } catch (SQLException e) {
            System.out.println("Erro ao excluir cadastro: " + e);
            return false;
        }
    }
    
    public ArrayList consultarTodos () {
        
        ArrayList<Evento> eventos = new ArrayList<>();
        
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "select * from evento";
            
            ResultSet resultado = st.executeQuery(sql);
            
            while (resultado.next()) {
                Evento ev = new Evento();
                ev.setId_evento(resultado.getInt("id"));
                ev.setNome_evento(resultado.getString("nome_evento"));
                ev.setCategoria_id(resultado.getInt("categoria_id"));
                ev.setData_evento(resultado.getString("data_evento"));
                ev.setValor_custo_evento(resultado.getDouble("valor_custo_evento"));
                ev.setObservacoes(resultado.getString("observacoes"));
                
                eventos.add(ev);
            }
            
        } catch (SQLException e) {
            System.out.println("Erro ao salvar cadastro: " + e);
        }
        
        return eventos;
    }
    
     public Evento consultarEventoId (int idEvento) {
        
        Evento ev = new Evento();
        
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "select * from evento where id = '" + idEvento + "';";
            
            ResultSet resultado = st.executeQuery(sql);
            
            resultado.next();
                ev.setId_evento(resultado.getInt("id"));
                ev.setNome_evento(resultado.getString("nome_evento"));
                ev.setCategoria_id(resultado.getInt("categoria_id"));
                ev.setData_evento(resultado.getString("data_evento"));
                ev.setValor_custo_evento(resultado.getDouble("valor_custo_evento"));
                ev.setObservacoes(resultado.getString("observacoes"));
        } catch (SQLException e) {
            System.out.println("Erro ao consultar o cadastro de pessoa: " + e);
        }
        return ev;
    }
}