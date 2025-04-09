public record Email(String endereco) implements ServicoMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando E-mail para " + endereco + ": " + mensagem);
    }
}
