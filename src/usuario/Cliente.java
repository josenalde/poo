public class Cliente extends Usuario { // para usar super() definir construtor sem parâmetros na superclasse
    private String cpf;
    public Cliente(String nome, String senha, String cpf) {
        super(nome,senha);
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Com cpf: " + cpf;
    }

}
