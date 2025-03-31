class ContaBancaria {
    private double saldo;
    private double chequeEspecial;
    private double valorUsadoChequeEspecial;

    public ContaBancaria(double depositoInicial) {
        this.saldo = depositoInicial;
        if (depositoInicial <= 500) {
            this.chequeEspecial = 50;
        } else {
            this.chequeEspecial = depositoInicial * 0.5;
        }
        this.valorUsadoChequeEspecial = 0;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public double consultarChequeEspecial() {
        return chequeEspecial;
    }

    public void depositar(double valor) {
        saldo += valor;
        if (valorUsadoChequeEspecial > 0) {
            double taxa = valorUsadoChequeEspecial * 0.2;
            saldo -= taxa;
            valorUsadoChequeEspecial = 0;
            System.out.println("Taxa de 20% do cheque especial utilizada: R$" + taxa);
        }
        System.out.println("Depósito realizado com sucesso.");
    }

    public boolean sacar(double valor) {
        if (saldo + chequeEspecial >= valor) {
            if (saldo >= valor) {
                saldo -= valor;
            } else {
                valorUsadoChequeEspecial = valor - saldo;
                saldo = 0;
                chequeEspecial -= valorUsadoChequeEspecial;
            }
            System.out.println("Saque realizado com sucesso.");
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }

    public boolean pagar(double valor) {
        if (saldo + chequeEspecial >= valor) {
            if (saldo >= valor) {
                saldo -= valor;
            } else {
                valorUsadoChequeEspecial = valor - saldo;
                saldo = 0;
                chequeEspecial -= valorUsadoChequeEspecial;
            }
            System.out.println("Pagamento realizado com sucesso.");
            return true;
        } else {
            System.out.println("Você não tem saldo para pagar o boleto.");
            return false;
        }
    }

    public boolean pagarCarne(double valor) {
        return pagar(valor);
    }

    public boolean estaUsandoChequeEspecial() {
        return valorUsadoChequeEspecial > 0;
    }
}