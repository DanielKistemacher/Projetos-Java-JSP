package atividadeestruturadados;

/**
 *
 * @author 552155 - Daniel Kistemacher da Silva
 */
public class AtividadeEstruturaDados {
    public static void main(String[] args) {
    
    int tamanhoVetor = 17000;
    int pilhaDesordenada[] = new int[tamanhoVetor];
    
    //Adicionando números inteiros ao vetor
    for (int i = 0; i < pilhaDesordenada.length; i++) {
        pilhaDesordenada[i] = (int) (Math.random() * tamanhoVetor);
    }
    
    //BUBBLESORT
    BubbleSort bubble = new BubbleSort(pilhaDesordenada);
    //Armazenando a hora inicial do método
    long inicioMsBubble = System.currentTimeMillis();
    //Utilizando o método BubbleSort para ordenar os elementos
    bubble.bubbleSort();
    //Armazenando a hora final do método
    long fimMsBubble = System.currentTimeMillis();
    System.out.println("BubbleSort realizado em = " + (fimMsBubble - inicioMsBubble) + " ms");
    
    //QUICKSORT
    QuickSort quick = new QuickSort();
    //Armazenando a hora inicial do método
    long inicioMsQuick = System.currentTimeMillis();
    //Utilizando o método QuickSort para ordenar os elementos
    quick.quickSort(pilhaDesordenada);
    //Armazenando a hora final do método
    long fimMsQuick = System.currentTimeMillis(); 
    System.out.println("QuickSort realizado em = " + (fimMsQuick - inicioMsQuick) + " ms");
    }
}
