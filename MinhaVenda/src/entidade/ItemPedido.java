package entidade;

/**
 *
 * @author Daniel
 */
public class ItemPedido {
    private int id;
    private int produtoId;
    private int pedidoId;
    private double qtd;
    private double ValorItem;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(int produtoId) {
        this.produtoId = produtoId;
    }

    public int getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }

    public double getQtd() {
        return qtd;
    }

    public void setQtd(double qtd) {
        this.qtd = qtd;
    }

    public double getValorItem() {
        return ValorItem;
    }

    public void setValorItem(double ValorItem) {
        this.ValorItem = ValorItem;
    }
}
