package main;
import models.MaquinaBanho;
import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        MaquinaBanho maquina = new MaquinaBanho();
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("\n=== Menu da Máquina de Banho ===");
            System.out.println("1 - Colocar pet na máquina");
            System.out.println("2 - Dar banho no pet");
            System.out.println("3 - Retirar pet da máquina");
            System.out.println("4 - Limpar máquina");
            System.out.println("5 - Abastecer água");
            System.out.println("6 - Abastecer shampoo");
            System.out.println("7 - Verificar níveis");
            System.out.println("8 - Verificar se há pet na máquina");
            System.out.println("9 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    maquina.colocarPet();
                    break;
                case 2:
                    maquina.darBanho();
                    break;
                case 3:
                    maquina.retirarPet();
                    break;
                case 4:
                    maquina.limparMaquina();
                    break;
                case 5:
                    maquina.abastecerAgua();
                    break;
                case 6:
                    maquina.abastecerShampoo();
                    break;
                case 7:
                    maquina.verificarNiveis();
                    break;
                case 8:
                    maquina.verificarPetNaMaquina();
                    break;
                case 9:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Escolha novamente.");
            }
        } while (opcao != 9);
        
        scanner.close();
    }
}
