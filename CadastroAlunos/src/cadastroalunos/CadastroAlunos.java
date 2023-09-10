package cadastroalunos;

import java.util.Scanner;

//Aluno: 552155 - DANIEL KISTEMACHER DA SILVA

public class CadastroAlunos {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nomeAluno, dataNasc, religiaoNome, estadoCivil, cidadeNome, cepCidade;
        
        Aluno[] alunos = new Aluno[10];
        
        for (int x=0; x<alunos.length; x++){
            System.out.println("-------- CADASTRO DE ALUNOS --------");
            System.out.print("Informe o nome do "+ (x+1) +"° aluno: ");
            nomeAluno = input.nextLine();
            System.out.print("Informe a data de nascimento do "+ (x+1) +"° aluno: ");
            dataNasc = input.nextLine();
            System.out.print("Informe a religião do "+ (x+1) +"° aluno: ");
            religiaoNome = input.nextLine();
            System.out.print("Informe o estado civil do "+ (x+1) +"° aluno: ");
            estadoCivil = input.nextLine();
            System.out.print("Informe a cidade do "+ (x+1) +"° aluno: ");
            cidadeNome = input.nextLine();
            System.out.print("Informe o CEP da cidade "+ (x+1) +" : ");
            cepCidade = input.nextLine();
            
            Religiao relig = new Religiao(religiaoNome);
            EstadoCivil estCivil = new EstadoCivil (estadoCivil);
            Cidade cid = new Cidade(cidadeNome, cepCidade);
            
            alunos[x] = new Aluno (nomeAluno, dataNasc, relig, estCivil, cid);
        }
        
        //Imprimindo dados
        for (Aluno aluno:alunos){
            System.out.println("\n-------- DADOS DOS ALUNOS --------");
            System.out.println("Nome do Aluno: "+ aluno.getNome() +"\n Data de nascimento: "+ aluno.getDataNascimento() +"\nReligião: "+ aluno.getReligiao().getDescricao() +
                    "\nEstado Civil: "+ aluno.getEstadoCivil().getDescricao() +"\nCidade: "+ aluno.getCidade().getDescricao() +"CEP: "+ aluno.getCidade().getCep());
        }
    }
}
