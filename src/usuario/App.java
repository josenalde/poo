public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente("Pedro","pedrosenha","123cpf");
        System.out.println(cliente.toString());

        Funcionario funcionario = new Funcionario("Ana", "456");
        funcionario.vendaProduto();

        Gerente gerente = new Gerente("Joaquim", "Silva");
        System.out.println(gerente.getNome() + ", o ");
        gerente.fecharCaixa();
        gerente.vendaProduto();
        
    }
}
