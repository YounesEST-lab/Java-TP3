public class Caisse {
    private Ticket[] tickets = new Ticket[50];
    private int nbTickets;
    public void ajouterTicket(Ticket t){
        if (nbTickets < tickets.length) tickets[nbTickets] = t;
        nbTickets++;
    }
    public double getCaisse(){
        double somme=0;
        for (int i=0;i<nbTickets;i++){
            somme+=tickets[i].total();
        }
        return somme;
    }
    public void affichierCaisse(){
        for (int i=0;i<nbTickets;i++){
            tickets[i].editerTicket();
        }
        System.out.println("Total Caisse : "+getCaisse());
        System.out.println("Nombre de Consommations : "+Ticket.getNombreConsommation());
    }
}
