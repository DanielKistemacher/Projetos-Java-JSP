package meuradio;

import java.util.Scanner;

public class MeuRadio {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int opcao;
        String estadoRadio;
                
        Radio radio1 = new Radio();
                
        do {
        System.out.println("\n ===== MENU RÁDIO =====");
        System.out.println("1 -> Ligar");
        System.out.println("2 -> Volume + 2");
        System.out.println("3 -> Volume - 2");
        System.out.println("4 -> Estação + 2");
        System.out.println("5 -> Estação - 2");
        System.out.println("6 -> Desligar");
        System.out.println("Escolha uma opção: ");
        opcao = input.nextInt();
        
        switch(opcao){
            case 1: radio1.ligar();
                    break;
            case 2: radio1.incrementarVolume();
                    break;
            case 3: radio1.decrementarVolume();
                    break;
            case 4: radio1.incrementarEstacao();
                    break;
            case 5: radio1.decrementarEstacao();
                    break; 
            case 6: radio1.desligar();
                    break; 
            default: System.out.println("Opção inválida");
                    break;
        }
        
        if (radio1.estado == true){
            estadoRadio = "Rádio ligado!";
        } else {
            estadoRadio = "Rádio desligado!";
        }
        
        System.out.println("\n ===== Informações atuais do Rádio =====");
        System.out.println("Estado: " + estadoRadio);
        System.out.println("Estação: " + radio1.estacao);
        System.out.println("Volume: " + radio1.volume);
        } while (radio1.estado == true);
    }
}
