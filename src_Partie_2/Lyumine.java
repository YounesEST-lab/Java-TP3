import java.util.Arrays;

public class Lyumine {
    private String nom;
    private boolean joyeux = true;
    private Lyumine[] connaissances = new Lyumine[20];
    private int nbConnaissances;

    public Lyumine(String nom) {
        this.nom = nom;
        System.out.println("Bonjour, je suis " + nom + ".");
    }
    public String getNom() { return nom; }
    public boolean estJoyeux() { return joyeux; }
    public void devenirTriste() { joyeux = false; }
    public void devenirJoyeux() { joyeux = true; }
    public void sourire() { System.out.println(nom + " : " + (joyeux ? ":)" : ":(")); }

    public void apprendreQueEstNe(Lyumine l) {
        System.out.println(nom + " : :) Bonjour " + l.nom + " !");
        if (l != this && !connait(l) && nbConnaissances < connaissances.length)
            connaissances[nbConnaissances++] = l;
    }
    public boolean connait(Lyumine l) {
        for (int i = 0; i < nbConnaissances; i++)
            if (connaissances[i] == l) return true;
        return false;
    }
    public void fairePresentationDesConnaissances() {
        for (int i = 0; i < nbConnaissances; i++)
            for (int j = 0; j < nbConnaissances; j++)
                if (i != j && !connaissances[i].connait(connaissances[j]))
                    connaissances[i].apprendreQueEstNe(connaissances[j]);
    }
    public void direLyuminesConnus() {
        if (nbConnaissances == 0) { System.out.println(nom + " : je ne connais personne."); return; }
        String[] noms = new String[nbConnaissances];
        for (int i = 0; i < nbConnaissances; i++) noms[i] = connaissances[i].nom;
        Arrays.sort(noms);
        System.out.println(nom + " : je connais " + String.join(", ", noms) + ".");
    }
}