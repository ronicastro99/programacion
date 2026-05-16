package AEA3.SistemaReservas;

public class Habitacio extends Allotjament {
    private int numLlits;

    public Habitacio(String nom, int capacitat, int numLlits) {
        super(nom, capacitat);
        this.numLlits = numLlits;
    }

    public int getNumLlits() {
        return numLlits;
    }

    public void setNumLlits(int numLlits) {
        this.numLlits = numLlits;
    }

    @Override
    public double calcularPreuPerNit() {
        double preuBase = 50.0;
        if (this.numLlits > 2) {
            return preuBase + ((this.numLlits - 2) * 20.0);
        }
        return preuBase;
    }

    @Override
    public String mostrarInformacio() {
        String estat = this.disponible ? "Disponible" : "Reservat";
        return "Habitació: " + this.nom + " (Llits: " + this.numLlits + ") " + estat;
    }
}