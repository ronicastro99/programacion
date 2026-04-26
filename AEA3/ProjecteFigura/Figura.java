package AEA3.ProjecteFigura;
import java.util.Scanner;

public abstract class Figura {
    protected String nombreFigura;
    protected int id;
    private static int contadorId = 1;

    public Figura() {
        this.id = contadorId++;
    }

    public abstract double calcularArea();
    
    public void imprimirDades() {
        System.out.println("La figura amb id " + id + " és un " + nombreFigura );
    }

    public void llegirDades() {
        System.out.println("Llegint dades");
    }
}