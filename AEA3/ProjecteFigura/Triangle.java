package AEA3.ProjecteFigura;

public class Triangle extends Figura {
    private int base;
    private int h;

    public Triangle() {
        super();
        this.nombreFigura = "triangle";
    }

    public Triangle(int base, int h) {
        this();
        this.base = base;
        this.h = h;
    }

    @Override
    public double calcularArea() { 
        return (base * h) / 2.0;
    }
}