public class Test {
        public static void main(String[] args) {
            Lyumine lyuminePapa = new Lyumine("LyuminePapa");
            lyuminePapa.sourire();
            Lyumine lyumineMama = new Lyumine("LyumineMama");
            lyumineMama.devenirTriste();
            lyumineMama.sourire();
            lyuminePapa.apprendreQueEstNe(lyumineMama);
            lyumineMama.apprendreQueEstNe(lyuminePapa);
        }
}

