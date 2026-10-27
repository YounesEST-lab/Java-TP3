public class TestCaisse {
    public static void main(String[] args) {
        Produit p1=new Produit("Café noir",8,TypeProduit.Boisson);
        Produit p2=new Produit("Jus d’orange",15,TypeProduit.Boisson);
        Produit p3=new Produit("Café crème ",10,TypeProduit.Boisson);
        Produit p4=new Produit("Petit pain",4,TypeProduit.Patisserie);
        Ticket t1=new Ticket(1);
        Ticket t2=new Ticket(2);
        t1.ajouter(p1,1);
        t1.ajouter(p2,2);
        t2.ajouter(p3,2);
        t2.ajouter(p4,4);
        Caisse c1=new Caisse();
        c1.ajouterTicket(t1);
        c1.ajouterTicket(t2);
        c1.affichierCaisse();
    }

}
