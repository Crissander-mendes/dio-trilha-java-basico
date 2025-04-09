public record Quadrado(double lado) implements Figura {
    @Override
    public double calcularArea() {
        return lado * lado;
    }
}