import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n=== CÁLCULO DE IMPOSTOS ===");
            System.out.println("1. Alimentação");
            System.out.println("2. Saúde e Bem Estar");
            System.out.println("3. Vestuário");
            System.out.println("4. Cultura");
            System.out.println("5. Sair");
            System.out.print("Escolha o tipo de produto: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 5) {
                continuar = false;
                System.out.println("Encerrando o programa...");
                break;
            }

            System.out.print("Digite o nome do produto: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o preço do produto: R$");
            double preco = scanner.nextDouble();

            Produto produto = null;

            switch (opcao) {
                case 1:
                    produto = new Alimentacao(nome, preco);
                    break;
                case 2:
                    produto = new SaudeBemEstar(nome, preco);
                    break;
                case 3:
                    produto = new Vestuario(nome, preco);
                    break;
                case 4:
                    produto = new Cultura(nome, preco);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            if (produto != null) {
                System.out.printf("Produto: %s | Preço: R$%.2f | Imposto: R$%.2f%n",
                        produto.getNome(), produto.getPreco(), produto.calcularImposto());
            }
        }

        scanner.close();
    }
}
