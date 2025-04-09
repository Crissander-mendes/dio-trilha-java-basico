public record Retangulo(double base, double altura) implements Figura {
    @Override
    public double calcularArea() {
        return base * altura;
    }
}