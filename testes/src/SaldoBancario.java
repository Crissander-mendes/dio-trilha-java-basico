import java.util.Scanner;

public class SaldoBancario {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

            // Entrada do saldo inicial
        double saldoInicial = scanner.nextDouble();
        
        // Entrada das três transações
        double transacao1 = scanner.nextDouble();
        double transacao2 = scanner.nextDouble();
        double transacao3 = scanner.nextDouble();

        // Cálculo do saldo final
        double saldoFinal = saldoInicial + transacao1 + transacao2 + transacao3;
        
        // Saldo final
        System.out.printf("%.2f\n", saldoFinal);

        scanner.close();
    }
}

        
        
