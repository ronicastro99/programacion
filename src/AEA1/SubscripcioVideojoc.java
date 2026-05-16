import java.util.Scanner;

public class SubscripcioVideojoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix el tipus de suscripció:(1-4)");
        
        int número = sc.nextInt();

        	switch (número) {
        	case  1:
        		System.out.print("Has escollit la subscripció Básica");
        		break;
        	case  2:
        		System.out.print("Has escollit la subscripció Stàndar");
        		break;
        	case  3:
        		System.out.print("Has escollit la subscripció Premium");
        		break;
        	case  4:	
        		System.out.print("Has escollit la subscripció Vip");
        		break;

        	default: 
        		System.out.println("Has escollit una opció no vàlida");
        	}
        }
    }
