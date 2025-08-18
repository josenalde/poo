public class App {
    public static void main(String[] args) throws Exception {
        Caneta minhaCaneta = new Caneta("bic","azul",0.7f,10,true);
        minhaCaneta.status();
        minhaCaneta.escrever();
        minhaCaneta.destampar();
        minhaCaneta.escrever();
        minhaCaneta.setCor("vermelha");

        String a = "uva";
        String b = "iva";
    System.out.println(a.compareTo(b));
    }
}
