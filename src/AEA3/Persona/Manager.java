package AEA3.Persona;
public class Manager extends Persona {
    private int numTrabajadores;


    public Manager(String nombre, String direccion, String puestoTrabajo, double salario, int numTrabajadores) {
        super(nombre, direccion, puestoTrabajo, salario);
        this.numTrabajadores = numTrabajadores;
    }

   
    @Override
    public double CalcularBonus() {
        return this.salario * 0.15;
    }

    public void gestionProyecto() {
        System.out.println("Gestion de proyecto");
    }
}