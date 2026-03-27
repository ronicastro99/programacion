package AEA3.NotasModular;
import java.util.Scanner;

public class CalculNota {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double[] misNotas = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("introduce la nota número " + (i+1) + ":");
            misNotas[i] = teclado.nextDouble();
        }

        System.out.println("Nota mitjana: " + CalcularMitjana(misNotas));
        System.out.println("Nota minima: " + CalcularMinima(misNotas));
        System.out.println("Nota máxima: " + CalcularMaxima(misNotas));
    }
}
