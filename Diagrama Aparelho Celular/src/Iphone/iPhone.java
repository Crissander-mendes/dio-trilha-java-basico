package Iphone;
import java.util.Scanner;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementação do ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("🎵 Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("⏸️ Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("🎶 Selecionando a música: " + musica);
    }

    // Implementação do AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("📞 Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("📲 Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("📩 Iniciando correio de voz...");
    }

    // Implementação do NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("🌐 Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("🆕 Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("🔄 Página atualizada.");
    }

    // Método main com menu interativo
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n📱 === MENU iPhone ===");
            System.out.println("1. Reprodutor Musical");
            System.out.println("2. Aparelho Telefônico");
            System.out.println("3. Navegador na Internet");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.println("\n🎵 Reprodutor Musical:");
                    System.out.print("Digite o nome da música: ");
                    String musica = scanner.nextLine();
                    meuIphone.selecionarMusica(musica);
                    meuIphone.tocar();
                    meuIphone.pausar();
                    break;

                case 2:
                    System.out.println("\n📞 Aparelho Telefônico:");
                    System.out.print("Digite o número para ligar: ");
                    String numero = scanner.nextLine();
                    meuIphone.ligar(numero);
                    meuIphone.atender();
                    meuIphone.iniciarCorreioVoz();
                    break;

                case 3:
                    System.out.println("\n🌐 Navegador na Internet:");
                    System.out.print("Digite a URL: ");
                    String url = scanner.nextLine();
                    meuIphone.exibirPagina(url);
                    meuIphone.adicionarNovaAba();
                    meuIphone.atualizarPagina();
                    break;

                case 0:
                    System.out.println("👋 Encerrando o sistema...");
                    break;

                default:
                    System.out.println("❌ Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
