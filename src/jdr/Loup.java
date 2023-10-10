package jdr;

import java.util.Random;

public class Loup extends Creature {
    public Loup() {
        super(new Random().nextInt(6) + 3, new Random().nextInt(6) + 5, 1);
    }

    @Override
    public String getNom() {
        return "Loup";
    }
}
