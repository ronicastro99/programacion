import java.util.Scanner;
public class MediaAritmetica{
    public static void main(String[]args){

        Scanner s = new Scanner(System.in);
       
        System.out.println("¿Cuántos valores quieres introducir?");
        int numero = s.nextInt();

        double[]valor = new double[numero];

        for(int i = 0; i <numero; i++){
            System.out.print("introduce el valor " + (i+1) + ":");
            valor[i] = s.nextDouble();
            }
        double suma = 0;
        for (int i = 0; i < numero; i++){
            suma += valor[i];
        }
        double media = suma/numero; 
        System.out.println("La media aritmetica es: " + media);


        }

        
    }