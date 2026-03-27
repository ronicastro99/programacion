package AEA3.CalculAreesModular;
public class Geometria {

    public static double areaCercle(double r) { 
        return Math.PI * r * r; 
    }

    public static double areaTriangle(double b, double h) { 
        return (b * h) / 2; 
    }

    public static double areaQuadrat(double c) { 
        return c * c; 
    }

    public static double areaRectangle(double b, double h) { 
        return b * h; 
    }

    public static double areaTrapezi(double bM, double bm, double h) {
        return ((bM + bm) * h) / 2;
    }

    public static double areaRombe(double dM, double dm) {
        return (dM * dm) / 2;
    }
}