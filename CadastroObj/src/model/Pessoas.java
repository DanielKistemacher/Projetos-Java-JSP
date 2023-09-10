package model;

import java.util.ArrayList;

public class Pessoas {
    private String nome;
    private int cpf;
    private String endereco;
    private String cidade;
    
    ArrayList<Pessoas> lista = new ArrayList();

    public Pessoas(String nome, int cpf, String endereco, String cidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.cidade = cidade;
    }

    public Pessoas() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public void adicionaPessoaLista(Pessoas pessoa){
        lista.add(pessoa);
    }
    
    public ArrayList<Pessoas> retornaListaPessoas(){
        return lista;
    }
    
    public ArrayList<Pessoas> retornaPessoas(){
        return lista;
    }
}
