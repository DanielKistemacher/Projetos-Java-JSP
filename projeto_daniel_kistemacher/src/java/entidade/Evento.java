package entidade;

/**
 *
 * @author Daniel
 */
public class Evento {
    private int id_evento;
    private String nome_evento;
    private int categoria_id;
    private String data_evento;
    private double valor_custo_evento;
    private String observacoes;

    public Evento() {
        this.nome_evento = "";
        this.categoria_id = 0;
        this.data_evento = "";
        this.valor_custo_evento = 0;
        this.observacoes = "";
    }

    public int getId_evento() {
        return id_evento;
    }

    public void setId_evento(int id_evento) {
        this.id_evento = id_evento;
    }

    public String getNome_evento() {
        return nome_evento;
    }

    public void setNome_evento(String nome_evento) {
        this.nome_evento = nome_evento;
    }

    public int getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(int categoria_id) {
        this.categoria_id = categoria_id;
    }

    public String getData_evento() {
        return data_evento;
    }

    public void setData_evento(String data_evento) {
        this.data_evento = data_evento;
    }

    public double getValor_custo_evento() {
        return valor_custo_evento;
    }

    public void setValor_custo_evento(double valor_custo_evento) {
        this.valor_custo_evento = valor_custo_evento;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}
