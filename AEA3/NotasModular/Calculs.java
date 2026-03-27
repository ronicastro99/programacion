package AEA3.NotasModular;

public class Calculs{

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