import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ComptadorParaules {

    public static void main(String[] args) {
        
        File fitxerEntrada = new File("entrada.txt");
        int totalParaules = 0;

        try {
            Scanner lector = new Scanner(fitxerEntrada);
            while (lector.hasNextLine()) {
                String linia = lector.nextLine();
            
                if (!linia.trim().isEmpty()) {
                    // Separem la línia per espais en blanc
                    String[] paraules = linia.trim().split("\\s+");
                    totalParaules += paraules.length;
                }
            } 
            
            System.out.println("S'han llegit i comptat les paraules correctament.");

            try {
                FileWriter escriptor = new FileWriter("sortida.txt", false);
                escriptor.write("El nombre total de paraules és: " + totalParaules + "\n"); 
                escriptor.flush();
                System.out.println("S'ha guardat el resultat al fitxer 'sortida.txt'.");
                } catch (IOException e) {
        
                System.out.println("Error: Hi ha hagut un problema en escriure el fitxer 'sortida.txt'.");
            }
    

        } catch (FileNotFoundException e) {

            System.out.println("Error: El fitxer 'entrada.txt' no s'ha trobat.");
        }
        
    }
}
