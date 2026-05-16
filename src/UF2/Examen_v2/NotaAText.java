package UF2.Examen_v2;

public class NotaAText {

    //Param. entr: Tenemos un 
    //Param. sort: la nota transformada en text
    public String notaAText(double nota) {
        if (nota < 0 || nota > 10) return "Nota no vàlida";
        if (nota < 5) return "Suspens";
        if (nota < 7) return "Aprovat";
        if (nota < 9) return "Notable";
        if (nota < 10) return "Excel·lent";
        return "";
    }
}