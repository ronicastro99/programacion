import java.util.Scanner;
public class Descuento95 {
	public static void main(String[] args) {

		Scanner s = new Scanner (System.in);
		System.out.println ("Introduce el precio ");
		double num = s.nextDouble();
		if (num > 95){
			double divisor = (15* num) / 100;
			System.out.println("El precio es:" +  (num - divisor));
        }
		else {
			System.out.println ("El precio es" + num);

		}
		
    } 
}
