public class SaudeBemEstar extends Produto{
    public SaudeBemEstar(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto() {
        return preco * 0.015;
    }

}
