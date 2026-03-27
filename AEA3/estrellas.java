public class estrellas{

    public static void main(String[] args) {

        System.out.println("¿Cuantas estrellas quieres?");
        estrellas(10);
        System.out.println("\nAquí se acaba el programa");
    }

    public static void estrellas(int numero) {
        for (int i = 0; i < numero; i++) {
            System.out.print("*");
        }
    }
}

    
