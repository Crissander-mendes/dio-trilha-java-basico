public record Whatsapp(String numero) implements ServicoMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem no WhatsApp para " + numero + ": " + mensagem);
    }
}
