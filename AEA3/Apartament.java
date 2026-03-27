 public class Apartament extends Allotjament {
    

    private int numeroHabitacions;
    private boolean teCuina;

    
    public Apartament(String nom, int capacitat, int numeroHabitacions, boolean teCuina) {
        super(nom, capacitat);
        this.numeroHabitacions = numeroHabitacions;
        this.teCuina = teCuina;
    }

    
    public double calcularPreuPerNit() {
        double preuBase = 100.0;
        // Calcula els extres: 10€ per cada habitació
        double extres = 10 * this.numeroHabitacions;
        
        // Retorna la suma del preu base + extres
        return extres;

    }


    public String mostrarInformacio() {
        // Un truc per mostrar "Sí" o "No" en comptes de "true" o "false" per la cuina
        String textCuina;
        if (this.teCuina == true) {
            textCuina = "Sí";
        } else {
            textCuina = "No";
        }

        // Retorna tota la informació junta
        return "Apartament: " + this.nom + " (Habitacions: " + this.numeroHabitacions + ", Cuina: " + textCuina + ") - Preu: " + calcularPreuPerNit() + "€";
    }
}
