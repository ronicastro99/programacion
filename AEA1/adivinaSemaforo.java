import java.util.Scanner;
public class adivinaSemaforo{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int numeroSecreto = 7;
        int intentos = 0;
        System.out.println("Adivina el número secreto. Tienes 3 intentos. ");
        while(intentos < 3){
            int numero = s.nextInt();
            intentos++;
            int contadorIntentos = 3 - intentos;
            if(numero != numeroSecreto){ 
                System.out.println("¡Incorrecto!"+ "intentos restantes: " + contadorIntentos + 
                " Introduce un número.");
                    if(intentos == 3){
                    System.out.println("Has superado el limite de intentos. " + "El numero era " + numeroSecreto +".");
                    }
            }else{
            System.out.println("¡Muy bien! El número secreto era " + numeroSecreto);


                    }                    
                }    
            }
    }
