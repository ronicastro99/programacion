import java.util.Scanner; 
    public class MaximoMinimo{
        public static void main(String[]args){

        int[] vector = {12, 3, 45, -3, 65, -5, 88, 89, 2, 23, 54, 33, 27, 53, 96, 0};
        int numMax = vector[0];
        int numMin = vector[0];

        System.out.println("El vector es: ");
        
        for (int i = 1; i < vector.length; i++) {
            if(vector[i] > numMax){
               numMax = vector[i];
            }
            if (vector[i] < numMin){
                numMin = vector[i];
            }
            System.out.println(vector[i]);
        }
            
            System.out.println("El número máximo es: " + numMax);
            System.out.println("El número mínimo es: " + numMin);
        


        }

        
        }
    