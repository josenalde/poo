package src;
public abstract class FiguraGeometrica {
    public static final double COORDENADA_CENTRO_X = 2;
    public static final double COORDENADA_CENTRO_Y = 2;

    public abstract float calcularArea(); // so assinatura

    public static double calcularDistancia(double x, double y) {
        double dx = (COORDENADA_CENTRO_X - x) * (COORDENADA_CENTRO_X - x);
        double dy = (COORDENADA_CENTRO_Y - y) * (COORDENADA_CENTRO_Y - y);
        double result = Math.sqrt(dx + dy);
        return result;
    }
}
