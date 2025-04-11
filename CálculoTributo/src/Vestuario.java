public class Vestuario extends Produto {
    public Vestuario(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto() {
        return preco * 0.025;
    }

}
