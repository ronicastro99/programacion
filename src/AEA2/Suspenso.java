import java.util.Scanner;
    public class Suspenso{
        public static void main(String[]args){
        
            Scanner sc = new Scanner(System.in);
            System.out.println("¿Cuántas notas quiere introducir?");
            int numeroNotas = sc.nextInt();
            
        
            while(numeroNotas <= 0){
                System.out.println("Introduce un número válido:");
                numeroNotas = sc.nextInt(); 
            }

            double[] notas = new double[numeroNotas];
            boolean suspenso = false;

            for(int i = 0; i < numeroNotas; i++){
                double nota;
                do { 
                   System.out.println("Introduce nota" + (i+1) + ": "); 
                   nota = sc.nextDouble();
                
            }while(nota < 0|| nota > 10.0 );
                System.out.println("Introduce nota entre 0 y 10)");
            notas[i] = nota;
            if (nota < 5.00){
                suspenso = true;
            } 

            if(suspenso){
                System.out.println("Hay al menos un suspenso"); 
            }
            
            }
            }
            
        }      