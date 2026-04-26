package AEA3.ProjecteFigura;
public class Main {
    public static void main(String[] args) {
        
        Triangle triangle = new Triangle(23, 24);
        
        Quadrat quadrat = new Quadrat(10);
        
        Cercle cercle = new Cercle(15);
        
        Rectangle rectangle = new Rectangle();
        rectangle.setCostat1(8);
        rectangle.setCostat2(12);
        
    
        Trapezi trapezi = new Trapezi(10, 20, 5);
        Rombe rombe = new Rombe(30, 15);
        Parallelogram parallelogram = new Parallelogram(12, 8);

        
        System.out.println("--- RESULTATS DE LES FIGURES ---");
        
        triangle.imprimirDades();
        System.out.println("L'àrea del triangle és: " + triangle.calcularArea());
        System.out.println("---------------------------------");

        quadrat.imprimirDades();
        System.out.println("L'àrea del quadrat és: " + quadrat.calcularArea());
        System.out.println("---------------------------------");

        rectangle.imprimirDades();
        System.out.println("L'àrea del rectangle és: " + rectangle.calcularArea());
        System.out.println("---------------------------------");

        trapezi.imprimirDades();
        System.out.println("L'àrea del trapezi és: " + trapezi.calcularArea());
        System.out.println("---------------------------------");

        rombe.imprimirDades();
        System.out.println("L'àrea del rombe és: " + rombe.calcularArea());
        System.out.println("---------------------------------");

        parallelogram.imprimirDades();
        System.out.println("L'àrea del parallelogram és: " + parallelogram.calcularArea());
        System.out.println("---------------------------------");

        cercle.imprimirDades();
        System.out.println("L'àrea del cercle és: " + cercle.calcularArea());
    }
}