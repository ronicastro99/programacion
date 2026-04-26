package AEA3.ProjecteFigura;

public class Rectangle extends Figura {
    private int costat1, costat2; 
    public Rectangle() { 
        super();
        this.nombreFigura = "rectangle";
    }

    @Override
    public double calcularArea() { 
        return (double) costat1 * costat2;
    }

    public void setCostat1(int c1) { this.costat1 = c1; }
    public void setCostat2(int c2) { this.costat2 = c2; }
}
