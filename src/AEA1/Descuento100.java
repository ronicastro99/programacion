import java.util.Scanner;
public class Descuento100 {
	public static void main(String[] args) {

		Scanner s = new Scanner (System.in);
		System.out.println ("Introduce el precio ");
		double num = s.nextDouble();
		if (num >= 100){
			double divisor = (8* num) / 100;
			System.out.println("S'ha aplicat descompte del 8%. El precio final es:" + (num- divisor));
        }
        else if (num < 30){
        	double suma = (num + 2);
        	System.out.println ("S'ha aplicat una penalización de 2 EUR. El precio final es:" + (suma));

        }
        else
			System.out.println("No hi ha penalització. El precio final es: " + num);



		}
		
    
}
