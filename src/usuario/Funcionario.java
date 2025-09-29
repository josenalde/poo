public class Funcionario extends Usuario {
    public Funcionario(String nome, String senha) {
        super(nome, senha);
    }

    public void vendaProduto() {
        System.out.println("Funcionario Vendendo Produto...");
    }
    

    public Funcionario() {
        
    }
}
