import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.println("\nDigite o número da conta: ");
        int numero = scanner.nextInt();

        double saldo = 237.48;
        
        System.out.println("\nOlá, Mario Andrade, obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.\n");
    }
}
