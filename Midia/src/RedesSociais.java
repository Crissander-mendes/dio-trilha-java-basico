public record RedesSociais(String usuario) implements ServicoMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem nas redes sociais para @" + usuario + ": " + mensagem);
    }
}