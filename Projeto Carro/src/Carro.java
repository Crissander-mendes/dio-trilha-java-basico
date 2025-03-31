class Carro {
    private boolean ligado;
    private int velocidade;
    private int marcha;

    public Carro() {
        this.ligado = false;
        this.velocidade = 0;
        this.marcha = 0;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Carro ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    public void desligar() {
        if (ligado && velocidade == 0 && marcha == 0) {
            ligado = false;
            System.out.println("Carro desligado.");
        } else {
            System.out.println("Não é possível desligar o carro em movimento ou com marcha engatada.");
        }
    }

    public void acelerar() {
        if (ligado && marcha != 0) {
            if (velocidade < 120) {
                velocidade++;
                System.out.println("Velocidade: " + velocidade + "km/h");
            } else {
                System.out.println("Velocidade máxima atingida!");
            }
        } else {
            System.out.println("O carro precisa estar ligado e com marcha engatada para acelerar.");
        }
    }

    public void diminuirVelocidade() {
        if (ligado && velocidade > 0) {
            velocidade--;
            System.out.println("Velocidade: " + velocidade + "km/h");
        } else {
            System.out.println("O carro já está parado.");
        }
    }

    public void trocarMarcha(int novaMarcha) {
        if (ligado) {
            if (novaMarcha == marcha + 1 || novaMarcha == marcha - 1) {
                if (velocidadeValidaParaMarcha(novaMarcha)) {
                    marcha = novaMarcha;
                    System.out.println("Marcha trocada para: " + marcha);
                } else {
                    System.out.println("Velocidade incompatível com essa marcha.");
                }
            } else {
                System.out.println("Não é possível pular marchas.");
            }
        } else {
            System.out.println("O carro precisa estar ligado para trocar marchas.");
        }
    }

    private boolean velocidadeValidaParaMarcha(int novaMarcha) {
        return switch (novaMarcha) {
            case 0 -> velocidade == 0;
            case 1 -> velocidade >= 0 && velocidade <= 20;
            case 2 -> velocidade >= 21 && velocidade <= 40;
            case 3 -> velocidade >= 41 && velocidade <= 60;
            case 4 -> velocidade >= 61 && velocidade <= 80;
            case 5 -> velocidade >= 81 && velocidade <= 100;
            case 6 -> velocidade >= 101 && velocidade <= 120;
            default -> false;
        };
    }

    public void virar(String direcao) {
        if (velocidade >= 1 && velocidade <= 40) {
            System.out.println("Virando para " + direcao);
        } else {
            System.out.println("A velocidade precisa estar entre 1km/h e 40km/h para virar.");
        }
    }

    public void verificarVelocidade() {
        System.out.println("Velocidade atual: " + velocidade + "km/h");
    }
}