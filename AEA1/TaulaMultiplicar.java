import java.util.Scanner; 
    public class TaulaMultiplicar{
        public static void main(String[]args){

        Scanner s = new Scanner(System.in);
        int i = 1;
        System.out.println("Fins quina taula de multiplicar vols conèixer?");
        int num = s.nextInt();
        
        while(i <= num){
            System.out.println("Tabla del" + i+":");
            int multiplicacion = 1;
            while(multiplicacion <= 10){
                System.out.println(i + " x " + multiplicacion + " = " + (i * multiplicacion));
                multiplicacion++;
            }

            i++;
        }

        

        

    }
}