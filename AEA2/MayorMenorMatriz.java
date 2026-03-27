import java.util.Scanner;

public class MayorMenorMatriz {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Introduce número de filas");
        int filas = s.nextInt();

        System.out.println("Introduce número de columnas");
        int columnas = s.nextInt();

        int[][] matriz = new int[filas][columnas];

        System.out.println("Introduce los valores de la matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = s.nextInt();
                    }
                }
        int mayor = matriz[0][0];
        int menor = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < columnas; j++) {

                int valor = matriz[i][j];

                if (valor > mayor) {
                    mayor = valor;
                    }

                if (valor < menor) {
                    menor = valor;
                    }
                }
            }

        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
    }
}   