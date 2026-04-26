package AEA3.Persona;

public class Developer extends Persona {

    public Developer(String nombre, String direccion, String puestoTrabajo, double salario) {
        super(nombre, direccion, puestoTrabajo, salario);
    }

    @Override
    public double CalcularBonus() {
        return this.salario * 0.10;
    }


    public void escribirCodigo() {
        System.out.println("Escribir Codigo");
    }
}