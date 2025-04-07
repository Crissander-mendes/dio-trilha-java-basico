public class Main {
    public static void main(String[] args) {
        BrRelogio br = new BrRelogio();
        br.setHora(16);
        br.setMinuto(45);
        br.setSegundo(30);

        UsaRelogio usa = new UsaRelogio();
        usa.sincronizar(br);

        System.out.println("Relógio Brasileiro: " + br.getHoraFormatada());
        System.out.println("Relógio Americano: " + usa.getHoraFormatada());
    }
}
