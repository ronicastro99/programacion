public class CasaRural extends Allotjament{

    private boolean teJardi;
    private boolean tePiscina;

    public CasaRural(String nom, int capacitat, boolean teJardi, boolean tePiscina){
        super(nom, capacitat);
        this.teJardi = teJardi;
        this.tePiscina = tePiscina;
    }
    public double calcularPreuPerNit(){
        double preuBase = 150.0;
        double extres = 0.0;
        if(tePiscina == true){
        extres = 50.0;
        return preuBase + extres;
    
    }



    }

}