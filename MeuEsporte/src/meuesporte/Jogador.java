package meuesporte;

// ALUNO: 552155 - DANIEL KISTEMACHER DA SILVA
// ATIVIDADE UNIDADE 04 DE PROGRAMAÇAÕ ORIENTADA A OBJETOS

public class Jogador {
    // atributos
    int codigo;
    String nome;
    String posicao;

    public Jogador(int codigo, String nome, String posicao) {
        this.codigo = codigo;
        this.nome = nome;
        this.posicao = posicao;
    }
    
    // metodos setter e getters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
}
