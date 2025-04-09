import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(java.util.Locale.US);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n=== CALCULADORA DE ÁREA ===");
            System.out.println("1. Calcular área do Círculo");
            System.out.println("2. Calcular área do Retângulo");
            System.out.println("3. Calcular área do Quadrado");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o raio do círculo: ");
                    double raio = scanner.nextDouble();
                    Figura circulo = new Circulo(raio);
                    System.out.println("Área do círculo: " + circulo.calcularArea());
                }
                case 2 -> {
                    System.out.print("Digite a base do retângulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Digite a altura do retângulo: ");
                    double altura = scanner.nextDouble();
                    Figura retangulo = new Retangulo(base, altura);
                    System.out.println("Área do retângulo: " + retangulo.calcularArea());
                }
                case 3 -> {
                    System.out.print("Digite o lado do quadrado: ");
                    double lado = scanner.nextDouble();
                    Figura quadrado = new Quadrado(lado);
                    System.out.println("Área do quadrado: " + quadrado.calcularArea());
                }
                case 0 -> {
                    System.out.println("Encerrando...");
                    continuar = false;
                }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
