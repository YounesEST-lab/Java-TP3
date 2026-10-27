public class Ticket {
    static private int nombreConsommation;
    private int numeroTable;
    private Produit[] produits=new Produit[10];
    private int[] quantites=new int[10];
    private int nbLignes=0;
    public Ticket(int numeroTable){
        this.numeroTable = numeroTable;
    }
    public void ajouter(Produit p,int quantite){
        produits[nbLignes]=p;
        quantites[nbLignes]=quantite;
        nbLignes++;
        nombreConsommation+=quantite;
    }
    public double total(){
        double total=0;
        for (int i =0;i<nbLignes;i++){
            total +=(produits[i].getPrix()*quantites[i])*(1+produits[i].getTva());
        }
        return total;
    }
    public static int getNombreConsommation() {
        return nombreConsommation;
    }
    public void editerTicket(){
        System.out.println("Table numéro : "+this.numeroTable) ;
        System.out.println("Libellé             Prix      TVA  Quantité");
        for (int i=0;i<nbLignes;i++){
            System.out.println(String.format("%-16s%8.2f%7.0f %%%10d", produits[i].getLibelle(), produits[i].getPrix(), produits[i].getTva() * 100, quantites[i]));
        }
        System.out.println("Total : "+total()+ " DH\n");
    }

}
