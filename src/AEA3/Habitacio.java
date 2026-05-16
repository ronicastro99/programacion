public class Habitacio extends Allotjament {
    
    private int numeroLlits;

    public Habitacio(String nom, int capacitat, int numeroLlits) {
        this.numeroLlits = numeroLlits;
    }


    @Override
    public double calcularPreuPerNit() {
        double preuBase = 50.0;
        if (this.numeroLlits > 2) {
            
            double extres = (this.numeroLlits - 2) * 20.0;
            return preuBase + extres;// <-- Rellena esto: suma la base + los extras
        } 
        
        
        return preuBase; // <-- Rellena esto
    }

    // 4. Reescribimos la función de mostrar info
    @Override
    public String mostrarInformacio() {
        return "Habitació: " + this.nom + " (Llits: " + this.numeroLlits + ") - Preu: " + calcularPreuPerNit() + "€";
    }
}