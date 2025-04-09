import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n=== MENU DE MENSAGENS DE MARKETING ===");
            System.out.println("1. Enviar SMS");
            System.out.println("2. Enviar E-mail");
            System.out.println("3. Enviar via Redes Sociais");
            System.out.println("4. Enviar via WhatsApp");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o número de telefone: ");
                    String numero = scanner.nextLine();
                    System.out.print("Digite a mensagem: ");
                    String mensagem = scanner.nextLine();
                    ServicoMensagem sms = new SMS(numero);
                    sms.enviarMensagem(mensagem);
                }
                case 2 -> {
                    System.out.print("Digite o e-mail: ");
                    String email = scanner.nextLine();
                    System.out.print("Digite a mensagem: ");
                    String mensagem = scanner.nextLine();
                    ServicoMensagem emailServico = new Email(email);
                    emailServico.enviarMensagem(mensagem);
                }
                case 3 -> {
                    System.out.print("Digite o nome de usuário: ");
                    String usuario = scanner.nextLine();
                    System.out.print("Digite a mensagem: ");
                    String mensagem = scanner.nextLine();
                    ServicoMensagem redes = new RedesSociais(usuario);
                    redes.enviarMensagem(mensagem);
                }
                case 4 -> {
                    System.out.print("Digite o número do WhatsApp: ");
                    String numero = scanner.nextLine();
                    System.out.print("Digite a mensagem: ");
                    String mensagem = scanner.nextLine();
                    ServicoMensagem whatsapp = new Whatsapp(numero);
                    whatsapp.enviarMensagem(mensagem);
                }
                case 0 -> {
                    System.out.println("Encerrando o sistema...");
                    continuar = false;
                }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}