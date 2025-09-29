public class Gerente extends Funcionario {
    public Gerente(String nome, String senha) {
        super(nome, senha);
    }
    public void fecharCaixa() {
        System.out.println("Gerente fechando caixa...");
    }
    /*@Override
    public void vendaProduto() {
        System.out.println("Gerente vendendo produto");
    }*/
}
