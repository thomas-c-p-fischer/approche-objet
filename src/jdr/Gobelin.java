package jdr;

import java.util.Random;

public class Gobelin extends Creature {
    public Gobelin() {
        super(new Random().nextInt(6) + 5, new Random().nextInt(6) + 10, 1);
    }

    @Override
    public String getNom() {
        return "Gobelin";
    }
}