public class UsaRelogio extends Relogio {

    @Override
    public void sincronizar(Relogio outroRelogio) {
        this.setHora(outroRelogio.getHora());
        this.setMinuto(outroRelogio.getMinuto());
        this.setSegundo(outroRelogio.getSegundo());
    }

    @Override
    public String getHoraFormatada() {
        int hora12 = hora % 12;
        if (hora12 == 0) hora12 = 12;
        String periodo = (hora < 12) ? "AM" : "PM";
        return String.format("%02d:%02d:%02d %s", hora12, minuto, segundo, periodo);
    }
}
