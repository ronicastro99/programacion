package AEA3.SistemaReservas;

public class Allotjament {
    protected String nom;
    protected int capacitat;
    protected boolean disponible;

    public Allotjament(String nom, int capacitat) {
        this.nom = nom;
        this.capacitat = capacitat;
        this.disponible = true; 
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCapacitat() {
        return capacitat;
    }

    public void setCapacitat(int capacitat) {
        this.capacitat = capacitat;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean reservar() {
        if (this.disponible) {
            this.disponible = false;
            return true; 
        }
        return false; 
    }

    public void alliberar() {
        this.disponible = true;
    }

    public double calcularPreuPerNit() {
        return 0.0; 
    }

    public String mostrarInformacio() {
        return ""; 
    }
}




