package AEA3.SistemaReservas;

public class CasaRural extends Allotjament {
    private boolean teJardi;
    private boolean tePiscina;

    public CasaRural(String nom, int capacitat, boolean teJardi, boolean tePiscina) {
        super(nom, capacitat);
        this.teJardi = teJardi;
        this.tePiscina = tePiscina;
    }

    public boolean isTeJardi() {
        return teJardi;
    }

    public void setTeJardi(boolean teJardi) {
        this.teJardi = teJardi;
    }

    public boolean isTePiscina() {
        return tePiscina;
    }

    public void setTePiscina(boolean tePiscina) {
        this.tePiscina = tePiscina;
    }

    @Override
    public double calcularPreuPerNit() {
        double preuBase = 150.0;
        if (this.tePiscina) {
            return preuBase + 50.0;
        }
        return preuBase;
    }

    @Override
    public String mostrarInformacio() {
        String jardiTxt = this.teJardi ? "Sí" : "No";
        String piscinaTxt = this.tePiscina ? "Sí" : "No";
        String estat = this.disponible ? "Disponible" : "Reservat";
        return "Casa Rural: " + this.nom + " (Jardí: " + jardiTxt + ", Piscina: " + piscinaTxt + ") " + estat;
    }
}