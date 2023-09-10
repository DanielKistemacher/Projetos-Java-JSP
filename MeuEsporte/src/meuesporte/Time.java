package meuesporte;

import java.util.ArrayList;

// ALUNO: 552155 - DANIEL KISTEMACHER DA SILVA
// ATIVIDADE UNIDADE 04 DE PROGRAMAÇAÕ ORIENTADA A OBJETOS

public class Time {
    // atributos
    int codigo;
    String nome;
    String tecnico;
    
    private ArrayList<Jogador> jogadoresTime = new ArrayList<Jogador>();

    public Time(int codigo, String nome, String tecnico) {
        this.codigo = codigo;
        this.nome = nome;
        this.tecnico = tecnico;
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

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }
    
    //Adicionando o jogador a lista de jogadores do time (ArrayList jogadoresTime).
    public void vincularJogador(Jogador j){
        this.jogadoresTime.add(j);
    }
    
    //Removendo o jogador a lista de jogadores do time (ArrayList jogadoresTime).
    public void desvincularJogador(Jogador x){
        this.jogadoresTime.remove(x);
    }
    
    //Listar os jogadores do time
    public ArrayList<Jogador> obterJogadores(){
        return jogadoresTime;
    }
}
