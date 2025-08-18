public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private int carga;
    private boolean tampada;

    public Caneta() {

    }

    public Caneta(String modelo, String cor, float ponta, int carga, boolean tampada) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = tampada;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void status() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ponta: " + ponta);
        System.out.println("Carga: " + carga);
        System.out.println("Tampada: " + tampada);
    }

    public void escrever() {
        if (!tampada && carga > 0) {
            System.out.println("estou escrevendo");
        } else {
            System.out.println("Estou tampada ahhhh");
        }
    }

    public void tampar() {
        if (tampada) System.out.println("Já estou tampada");
        else tampada = true;
    }

    public void destampar() {
        if (tampada) tampada = !tampada;
    }


}
