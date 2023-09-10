package dao;

import apoio.ConexaoBD;
import apoio.IDAOT;
import entidade.Pedido;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class PedidoDAO implements IDAOT<Pedido>{
    @Override
    public String insert(Pedido pedido) {

        String retornoConsulta = "";

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "insert into pedido "
                    + "values"
                    + "(default, "
                    + "'" + pedido.getData() + "', "
                    + "'" + pedido.getEnderecoEntrega() + "', "
                    + "'" + pedido.getObservacao() + "', "
                    + pedido.getClienteId() + ") returning id";

            System.out.println("SQL: " + sql);

            ResultSet retorno = st.executeQuery(sql);

            if (retorno.next()) 
                retornoConsulta = retorno.getString(1);
 
        } catch (Exception e) {
            System.out.println("Erro ao inserir Pedido: " + e);
            retornoConsulta = "ERROR:" + e.toString();
        }
        return retornoConsulta;
    }
    
    @Override
    public String update(Pedido pedido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Pedido> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Pedido> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pedido consultarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public boolean validarCampos(Pedido pedido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
