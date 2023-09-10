package entidade;

/**
 *
 * @author Daniel
 */
public class Curriculo {
    
    private int id;
    private String data_hora_cadastro;
    private String nome;
    private String email;
    private String telefone;
    private String escolaridade;
    private String exp_profissionais;
    private String outros;
    private char situacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData_hora_cadastro() {
        return data_hora_cadastro;
    }

    public void setData_hora_cadastro(String data_hora_cadastro) {
        this.data_hora_cadastro = data_hora_cadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getExp_profissionais() {
        return exp_profissionais;
    }

    public void setExp_profissionais(String exp_profissionais) {
        this.exp_profissionais = exp_profissionais;
    }

    public String getOutros() {
        return outros;
    }

    public void setOutros(String outros) {
        this.outros = outros;
    }

    public char getSituacao() {
        return situacao;
    }

    public void setSituacao(char situacao) {
        this.situacao = situacao;
    }
}