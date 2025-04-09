public record SMS(String numero) implements ServicoMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando SMS para " + numero + ": " + mensagem);
    }
}
