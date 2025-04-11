public class Cultura extends Produto{
    public Cultura(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto() {
        return preco * 0.04;
    }
}
