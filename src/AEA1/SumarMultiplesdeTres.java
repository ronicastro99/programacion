import java.util.Scanner;

public class SumarMultiplesdeTres {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Fins quin valor vols sumar multiples de 3?: ");
        int n = s.nextInt();

        int suma = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.println("Afegim " + i);
                suma += i;
            }
        }

        System.out.println("El resultat final és: " + suma);
    }
}
