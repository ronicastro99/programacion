import java.util.Scanner;
    public class Excellent{
        public static void main(String[]args){
        
            Scanner sc = new Scanner(System.in);
            System.out.println("¿Cuántas notas quiere introducir?");
            int numeroNotas = sc.nextInt();
            
        
            while(numeroNotas <= 0){
                System.out.println("Introduce un número válido:");
                numeroNotas = sc.nextInt(); 
            }

            double[] notas = new double[numeroNotas];
            boolean excelente = false;

            for(int i = 0; i < numeroNotas; i++){
                double nota;
                do { 
                    System.out.println("Introduce nota " + (i+1) + ": "); 
                    nota = sc.nextDouble();
                
                }while(nota < 0|| nota > 10.0 );
            
                //System.out.println("Introduce nota entre 0 y 10)");
                notas[i] = nota;
                if (nota == 10.00){
                    excelente = true;
                } 
            }
            
            if(excelente){
                System.out.println("Hay al menos un 10"); 
            }else{
                System.out.println("No hay ning-6-ún 10");

            }
        }
        
    }      