package cadastroalunos;

public class Cidade {
    // atributos
    String descricao;
    String cep;

    public Cidade(String descricao, String cep) {
        this.descricao = descricao;
        this.cep = cep;
    }

    // métodos setters e getters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
