package atividadeestruturadados;

import java.util.Random;

public class BubbleSort {
    //Atributos da classe
    private int pilha[];
    
    //Construtor que recebe um vetor como parâmetro
    public BubbleSort(int[] pilha) {
        this.pilha = pilha;
    }

    //Construtor vazio
    public BubbleSort() {
    }
    
    //Métodos getters e setters
    public int[] getPilha() {
        return pilha;
    }

    public void setPilha(int[] pilha) {
        this.pilha = pilha;
    }
        
    //Método simples de ordenação Bubble Sort
    public void bubbleSort(){
        for (int x=0; x<this.pilha.length - 1; x++){
            for (int y=0; y<this.pilha.length - 1; y++){
                if (this.pilha[y] > this.pilha[y + 1]){
                    int aux = this.pilha[y];
                    this.pilha[y] = this.pilha[y + 1];
                    this.pilha[y + 1] = aux;                    
                }                
            }
        }
    }
}