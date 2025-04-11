public class Alimentacao extends Produto{
    public Alimentacao(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto() {
        return preco * 0.01;
    }

}
