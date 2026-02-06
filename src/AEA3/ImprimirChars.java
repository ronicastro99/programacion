public class ImprimirChars{
    public static void main(String[]args){
        imprimir('*', 5);
        imprimir('#', 3);
        imprimir('A',4);
    }
        public static void imprimir (char caracterChar, int cantidad){
            for (int i = 0; i < cantidad; i++){
            System.out.print(caracterChar);
        }

        System.out.println();
    }
}