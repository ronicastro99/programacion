import java.util.Scanner; 
public class IniciacionPares{
    public static void main(String[]args){

        int[] pares = new int[100];

        System.out.println("Array con los primeros números pares: ");
        for(int i = 0; i < 100; i++){
        pares[i] = i * 2;
        System.out.print(pares[i] + " ");
            if((i+1) % 10 == 0) {
                System.out.println(" ");
            }
        }  
    }
}   
    
