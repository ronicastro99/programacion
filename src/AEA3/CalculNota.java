package AEA3;

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

public static double CalcularMitjana(double[] arrayNotas) {
    double suma = 0;

    for (int i = 0; i < 5; i++) {
        suma = suma + arrayNotas[i];
    }

    return suma / 5;

}

public static double CalcularMinima(double[] arrayNotas) {

    double minima = arrayNotas[0]; 
    
    for (int i = 0; i < 5; i++) {
        
        if (arrayNotas[i] < minima) {
            minima = arrayNotas[i];
        }
    }
    
    return minima;
}

public static double CalcularMaxima(double[] arrayNotas) {

    double maxima = arrayNotas[0]; 
    
    for (int i = 0; i < 5; i++) {
        
        if (arrayNotas[i] > maxima) {
            maxima = arrayNotas[i];
        }
    }
    
    return maxima;
}
}


