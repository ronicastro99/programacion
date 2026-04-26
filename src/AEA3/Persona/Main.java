package AEA3.Persona;

public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer("Ronnye", "Bac de roda 168", "Backend", 3000);

        System.out.println(dev.generarReport());
        System.out.println(dev.CalcularBonus());
        dev.escribirCodigo();
    }
}