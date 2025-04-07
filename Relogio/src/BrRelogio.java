public class BrRelogio extends Relogio {

    @Override
    public void sincronizar(Relogio outroRelogio) {
        this.setHora(outroRelogio.getHora());
        this.setMinuto(outroRelogio.getMinuto());
        this.setSegundo(outroRelogio.getSegundo());
    }

    @Override
    public String getHoraFormatada() {
        // Formato 24h
        return super.getHoraFormatada();
    }
}
