package AEA3.SistemaReservas;

public class Apartament extends Allotjament {
    private int habitacions;
    private boolean teCuina;

    public Apartament(String nom, int capacitat, int habitacions, boolean teCuina) {
        super(nom, capacitat);
        this.habitacions = habitacions;
        this.teCuina = teCuina;
    }

    public int getHabitacions() {
        return habitacions;
    }

    public void setHabitacions(int habitacions) {
        this.habitacions = habitacions;
    }

    public boolean isTeCuina() {
        return teCuina;
    }

    public void setTeCuina(boolean teCuina) {
        this.teCuina = teCuina;
    }

    @Override
    public double calcularPreuPerNit() {
        double preuBase = 100.0;
        return preuBase + (this.habitacions * 10.0);
    }

    @Override
    public String mostrarInformacio() {
        String cuinaTxt = this.teCuina ? "Sí" : "No";
        String estat = this.disponible ? "Disponible" : "Reservat";
        return "Apartament: " + this.nom + " (Habitacions: " + this.habitacions + ", Cuina: " + cuinaTxt + ") " + estat;
    }
}