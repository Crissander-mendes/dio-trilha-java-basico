public class Gerente {
    private String nome;
    private String email;
    private String senha;
    private final boolean administrador = true;

    public Gerente(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    public boolean isAdministrador() { return administrador; }

    public void gerarRelatorioFinanceiro() {
        System.out.println("Relatório financeiro gerado.");
    }

    public void consultarVendas() {
        System.out.println("Consultando vendas.");
    }

    public void realizarLogin() {
        System.out.println(nome + " fez login como gerente.");
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
