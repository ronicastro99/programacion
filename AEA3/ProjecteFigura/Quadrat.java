package AEA3.ProjecteFigura;

public class Quadrat extends Figura {
    private int costat; 

    public Quadrat() { super(); this.nombreFigura = "quadrat"; }
    
    public Quadrat(int costat) {
        this();
        this.costat = costat;
    }

    @Override
    public double calcularArea() {
        return (double) costat * costat;
    }

    public int getCostat() { return costat; }
    public void setCostat(int costat) { this.costat = costat; }
}