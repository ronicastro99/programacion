package AEA3.ProjecteFigura;

public class Cercle extends Figura {
    private int radi;

    public Cercle() { super(); this.nombreFigura = "cercle"; }

    public Cercle(int radi) {
        this();
        this.radi = radi;
    }

    @Override
    public double calcularArea() {
        return Math.PI * (radi * radi);
    }
    public int getRadi() { return radi; }
    public void setRadi(int radi) { this.radi = radi; }
}