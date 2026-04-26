package AEA3.ProjecteFigura;

public class Rombe extends Figura {
    private int dM, dm;

    public Rombe() { super(); this.nombreFigura = "rombe"; }

    public Rombe(int dM, int dm) { 
        this();
        this.dM = dM;
        this.dm = dm;
    }

    @Override
    public double calcularArea() { 
        return (dM * dm) / 2.0;
    }
}