package jdr;

import java.util.Random;

public class Personnage {
	private int force;
    private int pointsDeVie;
    private int score;
    private boolean estVivant;

    public Personnage() {
        Random random = new Random();
        this.force = random.nextInt(7) + 12;
        this.pointsDeVie = random.nextInt(31) + 20;
        this.score = 0;
        this.estVivant = true;
    }

	/**
	 * @return the force
	 */
	public int getForce() {
		return force;
	}

	/**
	 * @param force the force to set
	 */
	public void setForce(int force) {
		this.force = force;
	}

	/**
	 * @return the pointsDeVie
	 */
	public int getPointsDeVie() {
		return pointsDeVie;
	}

	/**
	 * @param pointsDeVie the pointsDeVie to set
	 */
	public void setPointsDeVie(int pointsDeVie) {
		this.pointsDeVie = pointsDeVie;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
    
	public boolean estEnVie() {
        return pointsDeVie > 0;
    }
	
	public void combattre(Creature creature) {
		if(!estEnVie()) {
			 Random random = new Random();
		        int attaquePersonnage = force + random.nextInt(10) + 1;
		        int attaqueCreature = creature.getForce() + random.nextInt(10) + 1;

		        if (attaquePersonnage > attaqueCreature) {
		            int degats = attaquePersonnage - attaqueCreature;
		            creature.recevoirDegats(degats);
		        } else if (attaquePersonnage < attaqueCreature) {
		            int degats = attaqueCreature - attaquePersonnage;
		            pointsDeVie -= degats;
		        }

		        if (creature.getPointsDeVie() <= 0) {
		            score += creature.getPointsDeVie() <= 0 ? creature.getScore() : 0;
		        }
		}
    }
}
