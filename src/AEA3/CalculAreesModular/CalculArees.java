package AEA3.CalculAreesModular;
import java.util.Scanner;

public class CalculArees {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String figura;

        do {
            mostrarMenu();
            figura = sc.nextLine().toLowerCase();

            switch (figura) {
                case "cercle": case "circle":
                    calcularCercle(); break;
                case "triangle":
                    calcularTriangle(); break;
                case "quadrat":
                    calcularQuadrat(); break;
                case "rectangle":
                    calcularRectangle(); break;
                case "trapezi":
                    calcularTrapezi(); break;
                case "rombe":
                    calcularRombe(); break;
                case "paral·lelogram": case "parallelogram":
                    calcularParallelogram(); break;
                case "fi":
                    System.out.println("Programa finalitzat."); break;
                default:
                    System.out.println("Figura no vàlida.");
            }
            System.out.println(); 
        } while (!figura.equals("fi"));
    }

    public static void mostrarMenu() {
        System.out.println("De quina figura vols calcular l'àrea?");
        System.out.println("Opcions: triangle, quadrat, rectangle, trapezi, rombe, paral·lelogram, cercle | FI per sortir");
    }

    // --- MÈTODES DE GESTIÓ D'ENTRADA ---

    public static void calcularCercle() {
        System.out.print("Radi del cercle: ");
        double r = sc.nextDouble(); sc.nextLine();
        System.out.println("L'àrea és: " + Geometria.areaCercle(r));
    }

    public static void calcularTriangle() {
        System.out.print("Base: "); double b = sc.nextDouble();
        System.out.print("Altura: "); double h = sc.nextDouble();
        sc.nextLine();
        System.out.println("L'àrea és: " + Geometria.areaTriangle(b, h));
    }

    public static void calcularQuadrat() {
        System.out.print("Costat: "); double c = sc.nextDouble();
        sc.nextLine();
        System.out.println("L'àrea és: " + Geometria.areaQuadrat(c));
    }

    public static void calcularRectangle() {
        System.out.print("Base: "); double b = sc.nextDouble();
        System.out.print("Altura: "); double h = sc.nextDouble();
        sc.nextLine();
        System.out.println("L'àrea és: " + Geometria.areaRectangle(b, h));
    }

    public static void calcularTrapezi() {
        System.out.print("Introdueix la base major: ");
        double bMajor = sc.nextDouble();
        System.out.print("Introdueix la base menor: ");
        double bMenor = sc.nextDouble();
        System.out.print("Introdueix l'altura: ");
        double h = sc.nextDouble();
        sc.nextLine(); 
        System.out.println("L'àrea del trapezi és: " + Geometria.areaTrapezi(bMajor, bMenor, h));
    }

    public static void calcularRombe() {
        System.out.print("Introdueix la diagonal major: ");
        double dMajor = sc.nextDouble();
        System.out.print("Introdueix la diagonal menor: ");
        double dMenor = sc.nextDouble();
        sc.nextLine();
        System.out.println("L'àrea del rombe és: " + Geometria.areaRombe(dMajor, dMenor));
    }

    public static void calcularParallelogram() {
        System.out.print("Introdueix la base: ");
        double b = sc.nextDouble();
        System.out.print("Introdueix l'altura: ");
        double h = sc.nextDouble();
        sc.nextLine();
        System.out.println("L'àrea del paral·lelogram és: " + Geometria.areaRectangle(b, h));
    }
}