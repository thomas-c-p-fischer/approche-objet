package jdr;

import java.util.Random;

public class Troll extends Creature {
    public Troll() {
        super(new Random().nextInt(6) + 10, new Random().nextInt(11) + 20, 1);
    }

    @Override
    public String getNom() {
        return "Troll";
    }
}
