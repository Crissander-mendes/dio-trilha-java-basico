import java.util.Scanner;

public class MenuCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Ligar o carro");
            System.out.println("2 - Desligar o carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Diminuir velocidade");
            System.out.println("5 - Trocar marcha");
            System.out.println("6 - Virar");
            System.out.println("7 - Verificar velocidade");
            System.out.println("8 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> carro.ligar();
                case 2 -> carro.desligar();
                case 3 -> carro.acelerar();
                case 4 -> carro.diminuirVelocidade();
                case 5 -> {
                    System.out.print("Informe a nova marcha (0 a 6): ");
                    int marcha = scanner.nextInt();
                    carro.trocarMarcha(marcha);
                }
                case 6 -> {
                    System.out.print("Virar para (esquerda/direita): ");
                    String direcao = scanner.next();
                    carro.virar(direcao);
                }
                case 7 -> carro.verificarVelocidade();
                case 8 -> {
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}