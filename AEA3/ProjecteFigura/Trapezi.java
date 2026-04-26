package AEA3.ProjecteFigura;

public class Trapezi extends Figura {
    private int a, b, h;
    public Trapezi() { super(); this.nombreFigura = "trapezi"; }

    public Trapezi(int a, int b, int h) { // 
        this();
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double calcularArea() { 
        return ((a + b) * h) / 2.0;
    }
}