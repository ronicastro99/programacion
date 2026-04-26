public class Allotjament {
    
    protected String nom;
    protected int capacitat;
    protected boolean disponible;

    public Allotjament(String nom, int capacitat) {
        this.nom = nom;
        this.capacitat = capacitat;
        this.disponible = true; 
    }

    //
    public String getNom() {
        return nom;
    }

    public boolean TieneDisponibilidad() {
        return disponible;
    }

    
    public boolean reservar() {
        // Si está disponible (true), lo cambiamos a ocupado (false) y devolvemos true (éxito)
        if (this.disponible == true) {
            this.disponible = false; // <-- Rellena esto (¿qué valor debe tener si se reserva?)
            return true;
        }
        // Si ya estaba ocupado, devolvemos false (fracaso)
        return false;
    }

    // 5. Método para Liberar
    public void alliberar() {
        // Cambiamos el estado para que vuelva a estar libre
        this.disponible = true; 
    }

    // 6. Métodos vacíos que los "Hijos" se encargarán de reescribir con su lógica
    public double calcularPreuPerNit() {
        return 0.0; 
    }

    public String mostrarInformacio() {
        return "";
    }
}