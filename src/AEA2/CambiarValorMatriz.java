public class CambiarValorMatriz{
    public static void main(String[]args){

        int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] salida = new int [3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){

                boolean ipar = (i % 2 == 0); 
                boolean jpar = (j % 2 == 0);

                if(ipar && jpar) {
                    salida[i][j] = 1;    
                }else if (ipar && !jpar){
                    salida[i][j]= 2;
                }else if (! ipar && jpar){
                    salida[i][j] = 3;
                } else {
                    salida [i][j] = 4;
                }
            }
        }

        System.out.println("Matriz de entrada: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    
        System.out.println("Matriz de salida: ");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(salida[i][j] + " ");
            }
        }
    }
}
