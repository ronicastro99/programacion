package AEA3;
public class Empresa{
}
class Client{
    private  String nom;
    private String adreça;
    private String telefon;
    private String mail;
}

class Peticio{
   private int quantitat; 
   public void assignarProducte(TipusProducte a){
   }
}
class TipusProducte{
    private String nom;
    private int codiIdentificador;
    private double preu;
    private int estoc;
    private boolean alaVenda;

}

class Transportista{
    private String nom; 
    private String telefon;
    private int numLicencia;

    public void assignarEncarrec(Encarrec a){   
}
    public void anularEncarrec(Encarrec a){

    }
}

class Sucursal{
    private String nom;
    private String adreça;
    private String telefon;
    private String mail;

    public void descansa(Transportista t){
    }
    public void treballa(Transportista t){
    }
    public void altaClient(Client c) {
    }
    public void baixaClient(Client c){
    }
    public void altaEncarrec(Client c,Encarrec e,Transportista t){
    }
    public void anularEncarrec(Encarrec e){

    }
}
class Encarrec{
    private int dia;
    private int mes; 
    private int hora;
    private int minuts;

    public void afegirProducte(Peticio P){
    }
    public void eliminarProducte(Peticio p){

    }
}

