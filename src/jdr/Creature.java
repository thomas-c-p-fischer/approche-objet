package jdr;

import java.util.Random;

public abstract  class Creature {
    private int force;
    private int pointsDeVie;
    private int score;

    public Creature(int force, int pointsDeVie, int score) {
        this.force = force;
        this.pointsDeVie = pointsDeVie;
        this.score = score;
    }

    public int getForce() {
        return force;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public int getScore() {
        return score;
    }

    public void recevoirDegats(int degats) {
        pointsDeVie -= degats;
    }

    public abstract String getNom();

    public boolean estEnVie() {
        return pointsDeVie > 0;
    }
}