package src;

public class Quadrado extends FiguraGeometrica {
    private float lado;
    public Quadrado(float lado) {
        this.setLado(lado);
    }
    public float getLado() {
        return lado;
    }
    public void setLado(float lado) {
        if (lado > 0)
            this.lado = lado;
    }
    
    public float calcularPerimetro() {
        return (float) lado * 4;
    }

    @Override
    public float calcularArea() {
        return (float) lado*lado;
    }
}
