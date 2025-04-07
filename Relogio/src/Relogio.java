public abstract class Relogio {
    protected int hora;
    protected int minuto;
    protected int segundo;

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        } else {
            throw new IllegalArgumentException("Hora inválida (0-23)");
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        } else {
            throw new IllegalArgumentException("Minuto inválido (0-59)");
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        } else {
            throw new IllegalArgumentException("Segundo inválido (0-59)");
        }
    }

    public String getHoraFormatada() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public abstract void sincronizar(Relogio outroRelogio);
}
