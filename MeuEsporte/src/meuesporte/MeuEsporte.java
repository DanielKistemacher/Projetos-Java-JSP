package meuesporte;

import java.util.ArrayList;
import java.util.Scanner;

// ALUNO: 552155 - DANIEL KISTEMACHER DA SILVA
// ATIVIDADE UNIDADE 04 DE PROGRAMAÇAÕ ORIENTADA A OBJETOS

public class MeuEsporte {
    
    static ArrayList<Jogador> pessoa = new ArrayList<Jogador>();
    static ArrayList<Time> clube = new ArrayList<Time>();

    public static void main(String[] args) {
        menuPrincipal();
    }
    
    public static void menuPrincipal(){
        Scanner input = new Scanner (System.in);
        
        int opcao;
        
        System.out.println("=============== MEU ESPORTE - MENU ===============");
        System.out.println("[1] - Cadastrar jogador;");
        System.out.println("[2] - Cadastrar time;");
        System.out.println("[3] - Listar jogadores cadastrados;");
        System.out.println("[4] - Listar times cadastrados (sem os jogadores);");
        System.out.println("[5] - Vincular jogador a um time;");
        System.out.println("[6] - Desvincular jogador de um time;");
        System.out.println("[7] - Listar dados completos de um time;");
        System.out.println("[8] - Sair;");
        System.out.print("-> Digite o número da opção desejada: ");
        opcao = input.nextInt();
        
        switch(opcao){
            case 1: cadastrarJogador();
                break;
            case 2: cadastrarTime();
                break;
            case 3: listarJogadores();
                    menuPrincipal();
                break;
            case 4: listarTimes();
                    menuPrincipal();
                break;
            case 5: vincularJogador();
                    menuPrincipal();
                break;
            case 6: desvincularJogador();
                    menuPrincipal();
            case 7: dadosTimeCompleto();
                    menuPrincipal();
                break;
            case 8: System.exit(0);
                break;
            default: System.out.println("Opção inválida!");
        }
    }
    
    public static void cadastrarJogador(){
        Scanner input = new Scanner(System.in);
        int codigoJogador, continuar;
        String nomeJogador, posicaoJogador;
        
        do {
            System.out.print("Informe o código do jogador: ");
            codigoJogador = input.nextInt();
            System.out.print("Informe o nome do jogador: ");
            input.nextLine(); //limpeza buffer teclado
            nomeJogador = input.nextLine().toUpperCase();
            System.out.print("Informe a posição do jogador: ");
            posicaoJogador = input.nextLine().toUpperCase();
            pessoa.add(new Jogador(codigoJogador, nomeJogador, posicaoJogador));
            
            System.out.println("\nDeseja continuar cadastrando jogadores ?");
            System.out.println("Digite '1' para continuar.");
            System.out.println("Digite '0' para ir ao menu principal.");
            continuar = input.nextInt();
        } while (continuar==1);
        menuPrincipal();
    }
    
    public static void listarJogadores(){
        System.out.println("\n=============== JOGADORES CADASTRADOS ===============");
        for (Jogador j : pessoa) {
            System.out.println("Código: " + j.getCodigo());
            System.out.println("Nome: " + j.getNome());
            System.out.println("Posição: " + j.getPosicao());
        }
        System.out.println("--------------------------------------------------");
    }
    
    public static void cadastrarTime(){
        Scanner input = new Scanner(System.in);
        int codigoTime, continuar;
        String nomeTime, tecnicoTime;
        
        do {
            System.out.print("Informe o código do time: ");
            codigoTime = input.nextInt();
            System.out.print("Informe o nome do time: ");
            input.nextLine(); //limpeza buffer teclado
            nomeTime = input.nextLine().toUpperCase();
            System.out.print("Informe o técnico do time: ");
            tecnicoTime = input.nextLine().toUpperCase();
            clube.add(new Time(codigoTime, nomeTime, tecnicoTime));
            
            System.out.println("\nDeseja continuar cadastrando times ?");
            System.out.println("Digite '1' para continuar.");
            System.out.println("Digite '0' para ir ao menu principal.");
            continuar = input.nextInt();
        } while (continuar==1);
        menuPrincipal();
    }
    
    public static void listarTimes(){
        System.out.println("\n=============== TIMES CADASTRADOS ===============");
        for (Time t : clube) {
            System.out.println("Código: " + t.getCodigo());
            System.out.println("Nome: " + t.getNome());
            System.out.println("Técnico: " + t.getTecnico());
        }
        System.out.println("--------------------------------------------------");
    }
    
    public static void vincularJogador(){
        listarJogadores();
        listarTimes();
        int codigoJogador, codigoTime, continuar=1;
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.print("Informe o código do jogador: ");
            codigoJogador = input.nextInt();
            System.out.print("O jogador de código '" + codigoJogador + "' irá para o time: ");
            codigoTime = input.nextInt();
            
            //Vinculando o jogador a um time.
            if (codigoTime > 0){
                clube.get(codigoTime-1).vincularJogador(pessoa.get(codigoJogador-1));
            } else if (codigoTime == 0){
                clube.get(codigoTime).vincularJogador(pessoa.get(codigoJogador));
            }
            
            
            System.out.println("\nDeseja continuar vinculando jogadores a um time ?");
            System.out.println("Digite '1' para continuar.");
            System.out.println("Digite '0' para ir ao menu principal.");
            continuar = input.nextInt();
        } while (continuar == 1);
        menuPrincipal();
    }
    
    public static void desvincularJogador(){
        int codigoJogador, codigoTime, continuar=1;
        Scanner input = new Scanner(System.in);
        
        dadosTimeCompleto();
                
        do{
            System.out.print("Informe o código do jogador: ");
            codigoJogador = input.nextInt();
            System.out.print("O jogador de código '" + codigoJogador + "' será removido do time: ");
            codigoTime = input.nextInt();
            
            //Desvinculando o jogador a um time.
            if (codigoTime < 0){
                clube.get(codigoTime-1).desvincularJogador(pessoa.get(codigoJogador-1));
            } else if (codigoTime == 0){
                clube.get(codigoTime).desvincularJogador(pessoa.get(codigoJogador));
            }
            
            System.out.println("\nDeseja desvincular mais jogadores ?");
            System.out.println("Digite '1' para continuar.");
            System.out.println("Digite '0' para ir ao menu principal.");
            continuar = input.nextInt();
        } while (continuar == 1);
        menuPrincipal();
    }
    
    public static void dadosTimeCompleto(){
        listarTimes();
        int codigoTime, continuar=1;
        Scanner input = new Scanner (System.in);
        
        System.out.print("Informe o código do time para listar os dados completos: ");
        codigoTime = input.nextInt();

        if (codigoTime > 0){
            ArrayList<Jogador> joga = clube.get(codigoTime-1).obterJogadores();
            for (int j = 0; j < joga.size(); j++) {
               System.out.println("- Código: "+ joga.get(j).getCodigo()+ " - Jogador: " + joga.get(j).getNome() + " - Posição: " + joga.get(j).getPosicao());
            }
        } else if (codigoTime == 0){
            ArrayList<Jogador> joga = clube.get(codigoTime).obterJogadores();
            for (int j = 0; j < joga.size(); j++) {
                System.out.println(" - Jogador: " + joga.get(j).getNome() + " - " + joga.get(j).getPosicao());
            }
        }
        System.out.println("--------------------------------------------------");
    }
}
