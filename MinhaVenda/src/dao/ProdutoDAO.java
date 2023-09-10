package dao;

import apoio.ConexaoBD;
import apoio.IDAOT;
import java.sql.Statement;
import entidade.Produto;
import java.util.ArrayList;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import prompts.Prompts;

/**
 *
 * @author Daniel
 */
public class ProdutoDAO implements IDAOT<Produto> {
    @Override
    public boolean validarCampos(Produto produto){
        if (produto.getDescricao().equals("")) {
            Prompts.promptAlerta("Preencha todos os campos!");
            return false;
        }
        return true;    
    }
    
    @Override
    public String insert(Produto produto) {
        try {
            Statement statement = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "insert into produto values (default, '" + 
                    produto.getDescricao() + "', " + 
                    produto.getValorUnitario() + ", " + 
                    produto.getQtdEstoque() + ")";
            
            int retorno = statement.executeUpdate(sql);
            
            Prompts.promptInfo("Produto cadastrado com sucesso.");
            return null;
            
        } catch (Exception e) {
            Prompts.promptErro("Erro ao inserir produto. Verifique o log.");
            System.out.println(e.getMessage());
            return e.getMessage();
        }
    }
    
    @Override
    public String update(Produto produto) {
        try {
            Statement statement = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "update produto set "
                    + "descricao = '"+ produto.getDescricao() + "',"
                    + "valor_unitario = " + produto.getValorUnitario() + ", "
                    + "qtde_estoque = " + produto.getQtdEstoque()
                    + " where id = " + produto.getId();
            
            Prompts.promptInfo("Produto atualizado com sucesso.");
            
            int retorno = statement.executeUpdate(sql);
            
            return null;
        } catch(Exception e) {
            Prompts.promptErro("Erro ao atualizar produto. Verique o log.");
            System.out.println("Erro: " + e.getMessage());
            return e.getMessage();
        }
    }

    @Override
    public String delete(int id) {
        
        try {
            Statement statement = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "delete from produto where id = " + id;
            
            Prompts.promptInfo("Produto excluído com sucesso.");
            
            int retorno = statement.executeUpdate(sql);
            
            return null;
        } catch(Exception e) {
            Prompts.promptErro("Erro ao excluir produto. Verique o log.");
            System.out.println("Erro: " + e.getMessage());
            return e.getMessage();
        }
    }
    
    @Override
    public ArrayList<Produto> consultarTodos() {
        
        ArrayList<Produto> produtos = new ArrayList();
        
        try {
            Statement statement = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "select * from produto order by descricao";
            
            ResultSet retorno = statement.executeQuery(sql);
            
            while (retorno.next()) {
                Produto produto = new Produto();
                
                produto.setId(retorno.getInt("id"));
                produto.setDescricao(retorno.getString("descricao"));
                produto.setValorUnitario(retorno.getDouble("valor_unitario"));
                produto.setQtdEstoque(retorno.getInt("qtde_estoque"));
                
                produtos.add(produto);
            }
            
        } catch (Exception e) {
            Prompts.promptErro("Erro ao consultar os produtos. Verifique o log.");
            System.out.println("Erro: " + e.getMessage());
        }
        return produtos;
    }
    
    @Override
    public ArrayList<Produto> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Produto consultarId(int id) {
        Produto produto = null;
        
        try {
            Statement statement = ConexaoBD.getInstance().getConnection().createStatement();
            
            String sql = "select * from produto where id=" + id;
            
            ResultSet retorno = statement.executeQuery(sql);
            
            while (retorno.next()) {
                produto = new Produto();
                
                produto.setId(retorno.getInt("id"));
                produto.setDescricao(retorno.getString("descricao"));
                produto.setValorUnitario(retorno.getDouble("valor_unitario"));
                produto.setQtdEstoque(retorno.getInt("qtde_estoque"));
            }
            
        } catch (Exception e) {
            Prompts.promptErro("Erro ao consultar o produto de código: " + id + ". Verifique o log.");
            System.out.println("Erro: " + e.getMessage());
        }
        return produto;
    }
    
    public void preencherTabela (JTable tabela, String criterio) {
        ResultSet resultadoQ;
        
        Object[][] dadosTabela = null;
        
        Object[] coluna = new Object[4];
        coluna[0] = "Código";
        coluna[1] = "Descrição";
        coluna[2] = "Valor Unit";
        coluna[3] = "Qtd Estoque";
        
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "select count(*) "
                    + "from produto "
                    + "where descricao like '%" + criterio + "%'");
            resultadoQ.next();
            
            dadosTabela = new Object[resultadoQ.getInt(1)][4];
        } catch (Exception e) {
            Prompts.promptErro("Erro ao criar a tabela de produtos. Verifique o log.");
            System.out.println("Erro: " + e.getMessage());
        }
        
        int linha = 0;
        
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "select * "
                    + "from produto "
                    + "where descricao like '%" + criterio + "%'");
            
            while (resultadoQ.next()) {
                dadosTabela[linha][0] = resultadoQ.getInt("id");
                dadosTabela[linha][1] = resultadoQ.getString("descricao");
                dadosTabela[linha][2] = resultadoQ.getDouble("valor_unitario");
                dadosTabela[linha][3] = resultadoQ.getInt("qtde_estoque");
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
                    column.setPreferredWidth(50);
                    break;
                case 3:
                    column.setPreferredWidth(50);
                    break;
            }
        }
    }
}
