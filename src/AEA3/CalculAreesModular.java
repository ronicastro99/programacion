import java.util.Scanner;

public class CalculAreesModular {

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


    public static void calcularTrapezi() {
        System.out.print("Introdueix la base major: ");
        double bMajor = sc.nextDouble();
        System.out.print("Introdueix la base menor: ");
        double bMenor = sc.nextDouble();
        System.out.print("Introdueix l'altura: ");
        double h = sc.nextDouble();
        sc.nextLine(); 
        System.out.println("L'àrea del trapezi és: " + areaTrapezi(bMajor, bMenor, h));
    }

    public static void calcularRombe() {
        System.out.print("Introdueix la diagonal major: ");
        double dMajor = sc.nextDouble();
        System.out.print("Introdueix la diagonal menor: ");
        double dMenor = sc.nextDouble();
        sc.nextLine();
        System.out.println("L'àrea del rombe és: " + areaRombe(dMajor, dMenor));
    }

    public static void calcularParallelogram() {
        System.out.print("Introdueix la base: ");
        double b = sc.nextDouble();
        System.out.print("Introdueix l'altura: ");
        double h = sc.nextDouble();
        sc.nextLine();
        System.out.println("L'àrea del paral·lelogram és: " + areaRectangle(b, h));
    }

    public static void calcularCercle() {
        System.out.print("Radi del cercle: ");
        double r = sc.nextDouble(); sc.nextLine();
        System.out.println("L'àrea és: " + areaCercle(r));
    }

    public static void calcularTriangle() {
        System.out.print("Base: "); double b = sc.nextDouble();
        System.out.print("Altura: "); double h = sc.nextDouble();
        sc.nextLine();
        System.out.println("L'àrea és: " + areaTriangle(b, h));
    }

    public static void calcularQuadrat() {
        System.out.print("Costat: "); double c = sc.nextDouble();
        sc.nextLine();
        System.out.println("L'àrea és: " + areaQuadrat(c));
    }

    public static void calcularRectangle() {
        System.out.print("Base: "); double b = sc.nextDouble();
        System.out.print("Altura: "); double h = sc.nextDouble();
        sc.nextLine();
        System.out.println("L'àrea és: " + areaRectangle(b, h));
    }


    public static double areaTrapezi(double bM, double bm, double h) {
        return ((bM + bm) * h) / 2;
    }

    public static double areaRombe(double dM, double dm) {
        return (dM * dm) / 2;
    }

    public static double areaCercle(double r) { return Math.PI * r * r; }
    public static double areaTriangle(double b, double h) { return (b * h) / 2; }
    public static double areaQuadrat(double c) { return c * c; }
    public static double areaRectangle(double b, double h) { return b * h; }
}
