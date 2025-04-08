public class Atendente {
    private String nome;
    private String email;
    private String senha;
    private double valorEmCaixa;
    private final boolean administrador = false;

    public Atendente(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.valorEmCaixa = 0.0;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    public double getValorEmCaixa() { return valorEmCaixa; }

    public boolean isAdministrador() { return administrador; }

    public void receberPagamento(double valor) {
        valorEmCaixa += valor;
        System.out.println("Pagamento de R$" + valor + " recebido.");
    }

    public void fecharCaixa() {
        System.out.println("Valor em caixa: R$" + valorEmCaixa);
    }

    public void realizarLogin() {
        System.out.println(nome + " fez login como atendente.");
    }

    public void realizarLogoff() {
        System.out.println(nome + " fez logoff.");
    }

    public void alterarDados(String nome, String email) {
        setNome(nome);
        setEmail(email);
        System.out.println("Dados alterados com sucesso.");
    }

    public void alterarSenha(String novaSenha) {
        setSenha(novaSenha);
        System.out.println("Senha alterada com sucesso.");
    }
}
