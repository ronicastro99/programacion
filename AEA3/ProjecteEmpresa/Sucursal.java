package AEA3.ProjecteEmpresa;

public class Sucursal {
    private String nom;
    private String adreça;
    private String telefon;
    private String mail;

    public void descansa(Transportista t) {}
    public void treballa(Transportista t) {}
    public void altaClient(Client c) {}
    public void baixaClient(Client c) {}
    public void altaEncarrec(Client c, Transportista t, Encarrec e) {}
    public void anul_laEncarrec(Encarrec e) {}
}