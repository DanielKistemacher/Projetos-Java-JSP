package atividadeestruturadados;
public class QuickSort {
    //Construtor vazio
    public QuickSort() {
    }
    
    public void quickSort(int[] pilha){
        ordenarQuick(pilha, 0, pilha.length - 1);
    }
    
    private void ordenarQuick(int[] pilha, int inicio, int fim) {
        if(fim > inicio) {
          //Dividindo a pilha em 3 partes.
          int indexPivo = dividir(pilha, inicio, fim);
          /* Método para redivisao da pilha de elementos menores
            que o pivô. */
          ordenarQuick(pilha, inicio, indexPivo - 1);
          /* Método para redivisao da pilha de elementos maiores
            que o pivô. */
          ordenarQuick(pilha, indexPivo + 1, fim);
        }
    }
    
    private int dividir(int[] vetor, int inicio, int fim) {
        int pivo, pontEsq, pontDir = fim;
        pontEsq = inicio + 1;
        pivo = vetor[inicio];

        while(pontEsq <= pontDir) {
            /* Percorre a pilha ate que ultrapasse o outro ponteiro
            ou ate que o elemento em questão seja menor que o pivô. */
            while(pontEsq <= pontDir && vetor[pontEsq] <= pivo) {
            pontEsq++;
            }

            /* Percorre a pilha ate que ultrapasse o outro ponteiro
              que o elemento em questão seja maior que o pivô. */
            while(pontDir >= pontEsq && vetor[pontDir] > pivo) {
              pontDir--;
            }

            /* Caso os ponteiros ainda nao tenham se cruzado, significa que valores
              menores e maiores que o pivô foram localizados em ambos os lados.
              Trocar estes elementos de lado. */
            if(pontEsq < pontDir) {
              alterar(vetor, pontDir, pontEsq);
              pontEsq++;
              pontDir--;
            }
        }
        alterar(vetor, inicio, pontDir);
        return pontDir;
    }
    
    private void alterar(int[] vetor, int i, int j) {
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }
}
