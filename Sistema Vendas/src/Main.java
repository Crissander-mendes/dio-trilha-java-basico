import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gerente gerente = new Gerente("Alice", "alice@email.com", "1234");
        Vendedor vendedor = new Vendedor("Bob", "bob@email.com", "abcd");
        Atendente atendente = new Atendente("Carol", "carol@email.com", "xyz");

        while (true) {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Gerente");
            System.out.println("2. Vendedor");
            System.out.println("3. Atendente");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 0) break;

            switch (opcao) {
                case 1:
                    gerente.realizarLogin();
                    System.out.println("1. Gerar relatório financeiro");
                    System.out.println("2. Consultar vendas");
                    System.out.println("3. Alterar dados");
                    System.out.println("4. Alterar senha");
                    System.out.println("5. Logoff");
                    System.out.print("Escolha uma ação: ");
                    int acaoG = scanner.nextInt(); scanner.nextLine();
                    switch (acaoG) {
                        case 1: gerente.gerarRelatorioFinanceiro(); break;
                        case 2: gerente.consultarVendas(); break;
                        case 3:
                            System.out.print("Novo nome: ");
                            String novoNomeG = scanner.nextLine();
                            System.out.print("Novo email: ");
                            String novoEmailG = scanner.nextLine();
                            gerente.alterarDados(novoNomeG, novoEmailG);
                            break;
                        case 4:
                            System.out.print("Nova senha: ");
                            gerente.alterarSenha(scanner.nextLine());
                            break;
                        case 5: gerente.realizarLogoff(); break;
                    }
                    break;

                case 2:
                    vendedor.realizarLogin();
                    System.out.println("1. Realizar venda");
                    System.out.println("2. Consultar vendas");
                    System.out.println("3. Alterar dados");
                    System.out.println("4. Alterar senha");
                    System.out.println("5. Logoff");
                    System.out.print("Escolha uma ação: ");
                    int acaoV = scanner.nextInt(); scanner.nextLine();
                    switch (acaoV) {
                        case 1: vendedor.realizarVenda(); break;
                        case 2: vendedor.consultarVendas(); break;
                        case 3:
                            System.out.print("Novo nome: ");
                            String novoNomeV = scanner.nextLine();
                            System.out.print("Novo email: ");
                            String novoEmailV = scanner.nextLine();
                            vendedor.alterarDados(novoNomeV, novoEmailV);
                            break;
                        case 4:
                            System.out.print("Nova senha: ");
                            vendedor.alterarSenha(scanner.nextLine());
                            break;
                        case 5: vendedor.realizarLogoff(); break;
                    }
                    break;

                case 3:
                    atendente.realizarLogin();
                    System.out.println("1. Receber pagamento");
                    System.out.println("2. Fechar caixa");
                    System.out.println("3. Alterar dados");
                    System.out.println("4. Alterar senha");
                    System.out.println("5. Logoff");
                    System.out.print("Escolha uma ação: ");
                    int acaoA = scanner.nextInt(); scanner.nextLine();
                    switch (acaoA) {
                        case 1:
                            System.out.print("Valor do pagamento: R$");
                            double valor = scanner.nextDouble();
                            atendente.receberPagamento(valor);
                            break;
                        case 2: atendente.fecharCaixa(); break;
                        case 3:
                            System.out.print("Novo nome: ");
                            String novoNomeA = scanner.nextLine();
                            System.out.print("Novo email: ");
                            String novoEmailA = scanner.nextLine();
                            atendente.alterarDados(novoNomeA, novoEmailA);
                            break;
                        case 4:
                            System.out.print("Nova senha: ");
                            atendente.alterarSenha(scanner.nextLine());
                            break;
                        case 5: atendente.realizarLogoff(); break;
                    }
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}
