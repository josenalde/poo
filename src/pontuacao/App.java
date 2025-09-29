import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Pontuacao> lista = new ArrayList<Pontuacao>();
        Pontuacao p1 = new Futebol("Real Madrid", 10, 1, 0);
        Pontuacao p2 = new Vantagem("321 milhas", 1500);
        Pontuacao p3 = new CartaoProva(10,5);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        for (Pontuacao l : lista) {
            System.out.println("Pontos: " + l.calcularPontos());
        }
    }
}
