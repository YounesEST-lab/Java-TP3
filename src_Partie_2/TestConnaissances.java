public class TestConnaissances {
    public static void main(String[] args) {
        Lyumine papa = new Lyumine("LyuminePapa");
        Lyumine mama = new Lyumine("LyumineMama");
        Lyumine petit = new Lyumine("LyuminePetit");
        papa.apprendreQueEstNe(mama);
        System.out.println("Papa connaît Mama : " + papa.connait(mama));
        System.out.println("Mama connaît Papa : " + mama.connait(papa));
        System.out.println("Papa connaît Petit : " + papa.connait(petit));
    }
}