package minhaimobiliaria;

import java.util.Scanner;

public class MinhaImobiliaria {
    public static void main(String[] args) {
        int opcao = 0, indice = 0;
        
        Scanner input = new Scanner (System.in);
        
        Imovel vetorImoveis[] = new Imovel [100];
        
        
        while (opcao != 4){
            System.out.println("==== MENU IMÓVEIS ====");
            System.out.println("[1] - Cadastrar imóvel");
            System.out.println("[2] - Listar todos os imóveis");
            System.out.println("[3] - Obter valor metro quadrado dos imóveis");
            System.out.println("[4] - Sair");
            System.out.println("Digite a opção: ");
            opcao = input.nextInt();

            switch(opcao){
                case 1: System.out.println ("Digite o código do imóvel: ");
                            input.nextLine(); //Esvaziar buffer teclado
                            String codigoImovel = input.nextLine();
                        System.out.println ("Digite o endereço do imóvel: ");
                            String endereco = input.nextLine();
                        System.out.println ("Digite a área total do imóvel: ");
                            double areaTotal = input.nextDouble();
                        System.out.println ("Digite o valor do imóvel: ");
                            double valor = input.nextDouble();
                        
                        Imovel imovel = new Imovel(codigoImovel, endereco, areaTotal, valor);
                        vetorImoveis[indice] = imovel;
                        indice ++;    
                    break;
                case 2: for (int i=0; i < indice; i++){
                            System.out.println(vetorImoveis[i].getCodigoImovel() + " - " +
                                               vetorImoveis[i].getEndereco() + " - " +
                                               vetorImoveis[i].getAreaTotal() + " m2 - " +
                                               vetorImoveis[i].getValor());
                        }
                    break;
                case 3: for (int i=0; i<indice; i++){
                            System.out.println(vetorImoveis[i].getCodigoImovel() + " - " +
                                               vetorImoveis[i].obterValorMetroQuadrado());
                        }
                    break;
                case 4: System.exit(0);
                    break;
                default: System.out.println("Opção inválida!");
            }
        }
    }
}
