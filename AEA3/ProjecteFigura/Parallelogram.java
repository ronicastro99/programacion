package AEA3.ProjecteFigura;

public class Parallelogram extends Figura {
    private int b, h;
    public Parallelogram() { super(); this.nombreFigura = "parallelogram"; }

    public Parallelogram(int b, int h) { 
        this();
        this.b = b;
        this.h = h;
    }

    @Override
    public double calcularArea() {
        return (double) b * h;
    }
}