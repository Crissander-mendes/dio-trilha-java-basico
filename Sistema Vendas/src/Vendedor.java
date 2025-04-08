public class Vendedor {
    private String nome;
    private String email;
    private String senha;
    private int quantidadeVendas;
    private final boolean administrador = false;

    public Vendedor(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.quantidadeVendas = 0;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    public int getQuantidadeVendas() { return quantidadeVendas; }

    public boolean isAdministrador() { return administrador; }

    public void realizarVenda() {
        quantidadeVendas++;
        System.out.println("Venda realizada com sucesso.");
    }

    public void consultarVendas() {
        System.out.println("Quantidade de vendas: " + quantidadeVendas);
    }

    public void realizarLogin() {
        System.out.println(nome + " fez login como vendedor.");
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