package AEA3.Persona;
public class Programmer extends Persona {
    public Programmer(String nombre, String direccion, String puestoTrabajo, double salario){
        super(nombre, direccion, puestoTrabajo, salario);
    }
public void debug (){
    System.out.println("Debugging");
}
@Override
public double CalcularBonus(){
   return salario * 0.12;
}
}