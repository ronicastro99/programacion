package UF2.Examen_v2;

import java.util.Scanner;

import UF2.Examen_v2.CercaDicotomica;

public class Examen2{

    public static double[] notes = new double[50];
    public int MARCA_NOTES = -1;
    public int NUM_NOTES = 0;
    public String MARCA_FI = "fi";
    private boolean fi = false;
    public double max = 0;
    public double min = 10;
    public double mitj = 0;
    String opcio = "";



    private final CalculArrays calculador = new CalculArrays();
    private final CercaDicotomica cerca = new CercaDicotomica();
    private final NotaAText transformar = new NotaAText();



    public static void main(String[] args) {
        Examen2 programa = new Examen2();
        programa.inici();
    }

    public void inici(){
        PreguntarNotes();
        ImprimirArrayNotes();

        
        if (NUM_NOTES > 0) {
            
            while (!fi) {
                MostrarMenu();
                TractarOpcio();
                if(opcio.equalsIgnoreCase("max")){
                    ImprimirResultat(max, transformar.notaAText(max), opcio);
                }
                else if(opcio.equalsIgnoreCase("min")){
                    ImprimirResultat(min, transformar.notaAText(min), opcio);


                }
                else if (opcio.equalsIgnoreCase("mitj")){
                    ImprimirResultat(mitj, transformar.notaAText(mitj), opcio);
                }
                else{

                }
            }
        }

            
            
    }
    

    //Param. entr:no en té
    //Param. sort:no en té
    //FUNCIÓ: llegir les notes
    
    private void PreguntarNotes() {
        Scanner teclat = new Scanner(System.in);
        
        System.out.println("Abans de començar, escriu tantes notes com vulguis (entre 0 i 10)");
        System.out.println("Quan hagis acabat d'escriure les notes, escriu un -1.");
    
        NUM_NOTES = 0;
        for (int i = 0; i < notes.length; i++) {
            System.out.print("Introdueix la nota número " + (i + 1) + ": ");
            double nota = teclat.nextDouble();
            
            if (nota == MARCA_NOTES) {
                break;
            }
            
            notes[NUM_NOTES] = nota;
            NUM_NOTES++;

            }

        //OPCIÓ 1 --> Les dades les definim DIRECTAMENT al programa
        //Desenvolupeu el vostre codi aquí


        // -----------------------

        //OPCIÓ 2 --> PUNTUACIÓ EXTRA (1p+). Agafem les dades de terminal
        //Comenceu per l'opció 1!!
        //System.out.println("\nAbans de començar, escriu tantes notes ENTERES com vulguis.");
        //System.out.println("\nQuan hagis acabat d'escriure les notes, escriu un -1.");
        //System .out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");
        //Desenvolupeu el vostre codi aquí
    }

    //Param. entr:
    //Param. sort:
    //FUNCIÓ: imprimir l'array de les notes just després que les haguem llegit
    private void ImprimirArrayNotes() {
        System.out.println("notes introduïdes:");
        for (int i = 0; i < NUM_NOTES; i++) {
            System.out.print(notes[i] + " ");
        }

    }

    //Param. entr:
    //Param. sort:
    private void MostrarMenu() {
        System.out.println("\nBenvinguda al càlcul de notes de classe.");
        System .out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");
        System.out.println("[MAX] Saber la nota màxima de classe");
        System.out.println("[MIN] Saber la nota mínima de classe");
        System.out.println("[MIT] Saber la nota mitjana de classe");
        System.out.println("[FI] Sortir.");
        System.out.print("Opció: ");
    }

    //Param. entr:
    //Param. sort: 
    //FUNCIÓ: tractar cadascuna de les opcions que l'usuari pot triar
    private void TractarOpcio() {
        Scanner teclado = new Scanner(System.in);
        String opcio = teclado.nextLine();
        
        double valorResultat = 0;

        if (opcio.equalsIgnoreCase(MARCA_FI)) {
            fi = true;
            System.out.println("FI");
            return;
        }

        switch (opcio) {
            case "MAX":
                /*max = notes[0];
                for (int i = 1; i < NUM_NOTES; i++) {
                    if (notes[i] > max) max = notes[i];
                }
                valorResultat = max;*/
                max = calculador.calcularMaxim(notes);
                opcio = "max";
                break;
                
            case "MIN":
                min = notes[0];
                for (int i = 1; i < NUM_NOTES; i++) {
                    if (notes[i] < min) min = notes[i];
                }
                valorResultat = min;
                opcio = "min";
                break;
                
            case "MIT":
                double suma = 0;
                for (int i = 0; i < NUM_NOTES; i++) {
                    suma += notes[i];
                }
                mitj = suma / NUM_NOTES;
                valorResultat = mitj;
                opcio = "mij";
                break;
            }
    }

    //Param. entr: la nota que volem transformar en text
    //Param. sort: la nota JA transformada en text i si modificar la variable per saber si algú ha tret un 8.
    //FUNCIÓ: Cridem la funció que ens transforma en text la notra nota.
    private String PrepararSortida(double valor) {

        //Desenvolupeu el vostre codi aquí
    }

    //Param. entr:
    //Param. sort:
    //FUNCIÓ: buscar si algú ha tret un 8 utilitzant una funció ja creada
    private boolean MirarSiAlgu8() {
        //Desenvolupeu el vostre codi aquí
        for (int i = 0; i < NUM_NOTES; i++) {
            if (notes[i] == 8.0) return true;
        }
    
        return false;
    }
    

    //Param. entr: tenim el double valornota, string text i string opció 
    //Param. sort: cap
    //FUNCIÓ: imprimir el resultat de l'opció que l'usuari ha triat.
    private void ImprimirResultat(double valornota, String text, String opcio) {
        String opcioescollida = "";
        if (opcio.equalsIgnoreCase("MAX")){
            opcioescollida = "màxim";
        }
        else if (opcio.equalsIgnoreCase("MIN")){
            opcioescollida = "mínim";
        }
        else {
            opcioescollida = "mitjà";
        }
        System.out.print("El valor " + opcioescollida +" de l'array que has escrit és " + valornota);
        System.out.println(" que equival a un " + text + ".n");
    }
}