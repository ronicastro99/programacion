import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese la longitud del vector");
        int n = s.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("ingrese los elementos del vector" + (i + 1) + ": ");
            numeros[i] = s.nextInt();
        }

        System.out.print("Ingrese el valor a buscasr: ");
        int buscador = s.nextInt();

        boolean numEncontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscador) {
                System.out.println("El numero" + numEncontrado + i);
                numEncontrado = true;
            }

            if (numEncontrado) {
                System.out.println("El numero" + numEncontrado + "no se encontró en el vector");
            }
        }
    }
}
