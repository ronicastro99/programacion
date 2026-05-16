package AEA3.Persona;

public class Persona {
    
    private String nombre;
    private String direccion;
    protected String puestoTrabajo;
    protected double salario;

    public Persona(String nombre, String direccion, String puestoTrabajo, double salario) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.puestoTrabajo = puestoTrabajo; 
        this.salario = salario;
    }

    public double CalcularBonus() {
        return 0; 
    }

    public String generarReport() {
        return "Report: " + this.nombre;
}
}