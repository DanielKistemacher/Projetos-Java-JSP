package cadastroalunos;

public class Aluno {
    // atributos
    String nome;
    String dataNascimento;
    Religiao religiao;
    EstadoCivil estadoCivil;
    Cidade cidade;

    public Aluno(String nome, String dataNascimento, Religiao religiao, EstadoCivil estadoCivil, Cidade cidade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.religiao = religiao;
        this.estadoCivil = estadoCivil;
        this.cidade = cidade;
    }
    
    // métodos setters e getters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Religiao getReligiao() {
        return religiao;
    }

    public void setReligiao(Religiao religiao) {
        this.religiao = religiao;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}
