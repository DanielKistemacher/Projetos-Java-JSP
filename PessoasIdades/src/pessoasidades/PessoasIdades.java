package pessoasidades;

import java.util.Scanner;

public class PessoasIdades {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nomePessoa, pessoaMaisVelha="", pessoaMaisNova="";
        int idadePessoa, maiorIdade=0, menorIdade=999;
        
        Pessoa[] pessoas = new Pessoa[10];
        
        System.out.println("---------- CADASTRO DE PESSOAS ----------");
        for (int x=0; x<pessoas.length; x++){
            System.out.print("Digite o nome da pessoa "+ (x+1)+": ");
            nomePessoa = input.nextLine().toUpperCase();
            
            System.out.print("Digite a idade da pessoa "+ (x+1)+": ");
            idadePessoa = input.nextInt();
            input.nextLine();
            
            if (idadePessoa > maiorIdade){
                maiorIdade = idadePessoa;
                pessoaMaisVelha = nomePessoa;
            } else if (idadePessoa < menorIdade){
                menorIdade = idadePessoa;
                pessoaMaisNova = nomePessoa;
            }
            
            pessoas[x] = new Pessoa(nomePessoa, idadePessoa);
        }
        
        System.out.println("---------- INFORMAÇÕES DAS PESSOAS ----------");
        for (Pessoa pessoa : pessoas){
            System.out.println("Nome: "+ pessoa.getNome()+ "\nIdade: "+ pessoa.getIdade());
        }
        System.out.println("\nNome da pessoa mais velha: "+ pessoaMaisVelha +"\nIdade da pessoa mais velha: "+ maiorIdade+
        "\nNome da pessoa mais nova: "+ pessoaMaisNova + "\nIdade da pessoa mais nova: "+ menorIdade);
    }
}
