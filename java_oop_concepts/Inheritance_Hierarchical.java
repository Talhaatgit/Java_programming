class Instrument {
    void play() { System.out.println("Playing instrument"); }
}

class Guitar extends Instrument {
    void strum() { System.out.println("Strumming guitar"); }
}

class Piano extends Instrument {
    void press() { System.out.println("Pressing piano keys"); }
}

public class Inheritance_Hierarchical {
    public static void main(String[] args) {
        Guitar g = new Guitar();
        Piano p = new Piano();
        g.play(); g.strum();
        p.play(); p.press();
    }
}

