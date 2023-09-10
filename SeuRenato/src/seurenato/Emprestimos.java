package seurenato;
public class Emprestimos {
    static String[] tipoFerramenta = new String[3]; //vetor de tipos
    static String[][] clientes = new String[3][3]; // matriz de clientes

    //metodo main
    public static void main(String[] args) {
        inicializaVetores(); //chamada de funcao para inicializar os vetores e matrizes
        menu();//chamada de funcao para montar e executar o menu
    }

    static void inicializaVetores() {
        int i;
        int j;
        for (i = 0; i < 3; i++) { //percorre o vetor de tipos previamente definido e os atribui vazio
            tipoFerramenta[i] = "";
        }
        
        
        for (i = 0; i < 3; i++) {//percorre a matriz de clientes previamente definida e os atribui vazio
            for (j = 0; j < 3; j++) {
                clientes[i][j] = "";
            }
        }
    }

    static int verificaPosicaoLivreNoVetor(String vetor[]) { //funcao para encontrar um espaco vazio no vetor
        // deve ser passado um vetor como parametro
        int i = 0;
        int x = -1; //previamente setada para -1 que vai significar que nao ha mais espaco
        while (i < vetor.length) {//percorre o vetor em busca de um espa�o vazio
            if (vetor[i] == "") {  //quando encontra, atribui o �ndice a X e X deixa de ser -1
                x = i;
                i = vetor.length; //atribui o tamanho m�ximo a i para sair do la�o de repeticao
            }
            i++; // incrementa i se ainda n�o encontrou espaco vazio
        }
        return x;  //retorna o valor de X (que e a posicao no vetor)
    }

    static int verificaPosicaoLivreNaMatriz(String matriz[][]) { //mesmo funcionamento do vetor, porem aqui o parametro e uma matriz
        int i = 0;
        int x = -1;
        while (i < matriz.length) {
            if (matriz[i][0] == "") {
                x = i;
                i = matriz.length;
            }
            i++;
        }
        return x;
    }

    //  menu principal
    static void menu() {
        int opcao = 0;
        do {
            System.out.println("\n\n### SIFERRA - Sistema de Controle de Ferramentas ###");
            System.out.println("\n                  ==========================================");
            System.out.println("                  |     1 - Cadastro de Clientes             |");
            System.out.println("                  |     2 - Cadastro de Tipos                |");
            System.out.println("                  |     3 - Cadastro de Objetos              |");
            System.out.println("                  |     4 - Manutenções                      |");
            System.out.println("                  |     0 - Sair                             |");
            System.out.println("                  ============================================\n");

            opcao = Entrada.leiaInt("Opção -> ");
            System.out.print("\n");
            switch (opcao) {
                case 1: {
                    cadClientes(); //se a opcaoo digitada for 1, abre o menu de clientes
                    break;
                }
                case 2: {
                    tipos();
                    break;
                }
                case 3: {
                    cadObjetos();
                    break;
                }
                case 4: {
                    manutencoes();
                    break;
                }
                case 0: {
                    System.out.println("Saindo...!");
                    System.exit(0);
                }
                default:
                    System.out.println("Opção Inválida!");
            }
        } while (opcao != 0); //retorna sempre ao menu ate a opcao digitada seja zero
    }

    static void cadClientes() { //funcao que controla a matriz de clientes
        int op = 0;
        int linha;
        do { //menu de operações de clientes
            System.out.println("\nCadastro de Clientes");
            System.out.println("\n");
            System.out.println(" 1 - Cadastrar");
            System.out.println(" 2 - Alterar");
            System.out.println(" 3 - Excluir");
            System.out.println(" 4 - Listar");
            System.out.println(" 0 - Sair");
            System.out.println("\n");

            op = Entrada.leiaInt("Operação -> ");
            System.out.print("\n");
            switch (op) {
                case 1: {
                    System.out.println("\nCadastro");
                    linha = verificaPosicaoLivreNaMatriz(clientes); //chama a funcao para encontrar uma linha vazia na matriz
                    //passando como parametro a matriz clientes
                    if (linha == -1) { //se a posicao retornada for -1 e porque nao ha mais espaco
                        System.out.println("** Não há posições livres na matriz de clientes **");
                    } else {
                        clientes[linha][0] = Entrada.leiaString("Nome -> ");//atribui o campo nome na posicao [linha][coluna0] da matriz
                        clientes[linha][1] = Entrada.leiaString("E-mail -> ");//atribui o campo email na posicao [linha][coluna1] da matriz
                        clientes[linha][2] = Entrada.leiaString("Cidade -> ");//atribui o campo cidade na posicao [linha][coluna1] da matriz
                        System.out.println("=> Tipo cadastrado com sucesso! <=");
                    }

                    break;
                }
                case 2: {
                    System.out.println("\nAlterar");
                    System.out.println("******************");
                    System.out.println("Existem estes clientes cadastrados:");
                    System.out.println("Cód.    Nome         Email          Cidade");
                    int i;
                    int j;
                    for (i = 0; i < clientes.length; i++) { //percorrendo a matriz mostrando os valores. i para linha e j para coluna
                        System.out.print(i);
                        for (j = 0; j < clientes.length; j++) {
                            System.out.print("       " + clientes[i][j]);
                        }
                        System.out.println("");
                    }
                    linha = Entrada.leiaInt("Informe o codigo para ser alterado -> ");
                    //altera os valores existentes na linha informada 
                    //sugestão: inserir aqui um método para verificar se a linha digitada existe na matriz
                    clientes[linha][0] = Entrada.leiaString("Informe o novo nome para " + clientes[linha][0] + ": ");
                    clientes[linha][1] = Entrada.leiaString("Informe o novo e-mail para " + clientes[linha][0] + ": ");
                    clientes[linha][2] = Entrada.leiaString("Informe a nova cidade para " + clientes[linha][0] + ": ");
                    System.out.println("=> Cliente alterado com sucesso! <=");
                    break;
                }

                case 3: { //metodo de "exclusao" atribuindo vazios a linha selecionada, semelhante ao editar.
                    System.out.println("\nExcluir");
                    System.out.println("******************");
                    System.out.println("Existem estes clientes cadastradas:");
                    System.out.println("C�d.   Nome           Email          Cidade");
                    int i;
                    int j;
                    for (i = 0; i < clientes.length; i++) {
                        System.out.print(i);
                        for (j = 0; j < clientes.length; j++) {
                            System.out.print("       " + clientes[i][j]);
                        }
                        System.out.println("");
                    }
                    linha = Entrada.leiaInt("Informe o codigo para ser excluído -> "); //
                    clientes[linha][0] = "";
                    clientes[linha][1] = "";
                    clientes[linha][2] = "";
                    System.out.println("=> Exclusão efetuada com sucesso! <=");
                    break;
                }

                case 4: {
                    int i;
                    int j;
                    for (i = 0; i < clientes.length; i++) {
                        System.out.print(i);
                        for (j = 0; j < clientes.length; j++) {
                            System.out.print("       " + clientes[i][j]);
                        }
                        System.out.println("");
                    }
                    break;
                }

                case 0: {
                }
                default:
                    System.out.println("Opção Inválida!");
            }
        } while (op != 0);
    }

    static void cadObjetos() {// funcao para manipular um vetor ou matriz de objetos

    }

    static void manutencoes() {// funcao para manipular um vetor ou matriz de manuten��es

    }

    static void tipos() { // o mesmo funcionamento dos clientes porem  com um vetor ao invés de uma matriz
        int op = 0;
        int pos;
        do {
            System.out.println("\nCadastro de Tipos de Ferramentas");
            System.out.println("\n");
            System.out.println(" 1 - Cadastrar");
            System.out.println(" 2 - Alterar");
            System.out.println(" 3 - Excluir");
            System.out.println(" 4 - Listar");
            System.out.println(" 0 - Sair");
            System.out.println("\n");

            op = Entrada.leiaInt("Operação -> ");
            System.out.print("\n");
            switch (op) {
                case 1: {
                    System.out.println("\nCadastro");
                    pos = verificaPosicaoLivreNoVetor(tipoFerramenta);
                    if (pos == -1) {
                        System.out.println("** Não há posições livres no vetor de tipos **");
                    } else {
                        tipoFerramenta[pos] = Entrada.leiaString("Informe o tipo de ferramenta -> ");
                        System.out.println("=> Tipo cadastrado com sucesso! <=");
                    }

                }
                case 2: {
                    System.out.println("\nAlterar");
                    System.out.println("******************");
                    System.out.println("Existem estes tipos de ferramentas cadastradas:");
                    System.out.println("Cód.   Tipo");
                    int i;
                    for (i = 0; i < tipoFerramenta.length; i++) {
                        System.out.println(i + "   -    " + tipoFerramenta[i]);
                    }
                    pos = Entrada.leiaInt("Informe o código para ser alterado -> ");
                    tipoFerramenta[pos] = Entrada.leiaString("Informe o novo nome para " + tipoFerramenta[pos] + ": ");
                    System.out.println("=> Alteração efetuada com sucesso! <=");
                }
                case 3: {
                    System.out.println("\nExcluir");
                    System.out.println("******************");
                    System.out.println("Existem estes tipos de ferramentas cadastradas:");
                    System.out.println("Cód.   Tipo");
                    int i;
                    for (i = 0; i < tipoFerramenta.length; i++) {
                        System.out.println(i + "   -    " + tipoFerramenta[i]);
                    }
                    pos = Entrada.leiaInt("Informe o código para ser excluido -> ");
                    tipoFerramenta[pos] = "";
                    System.out.println("=> Exclusão efetuada com sucesso! <=");
                }
                case 4: {
                    int i;
                    for (i = 0; i < tipoFerramenta.length; i++) {
                        System.out.println(i + "   -    " + tipoFerramenta[i]);
                    }
                }

                case 0: {
                }
                default:
                    System.out.println("Opão inválida!");
            }
        } while (op != 0);
    }

   
}
