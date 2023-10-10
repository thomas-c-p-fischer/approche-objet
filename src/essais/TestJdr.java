package essais;

import java.util.Random;
import java.util.Scanner;

import jdr.Creature;
import jdr.Gobelin;
import jdr.Loup;
import jdr.Personnage;
import jdr.Troll;

public class TestJdr {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        boolean jouer = true;
        Personnage personnage = null;
        Random random = new Random();

        while (jouer) {
            System.out.println("Menu du jeu :");
            System.out.println("1. Créer le personnage");
            System.out.println("2. Combattre une créature");
            System.out.println("3. Afficher le score");
            System.out.println("4. Sortir");
            System.out.print("Choisissez une option : ");
            int choix = scanner.nextInt();

            switch (choix) {
            case 1:
                personnage = new Personnage();
                System.out.println("Personnage créé avec succès !");
                break;
            case 2:
                if (personnage == null || !personnage.estEnVie()) {
                    System.out.println("Votre personnage est décédé. Il a obtenu le score de " + personnage.getScore() + " points. Veuillez créer un nouveau personnage.");
                } else {
                	int choixCreature = random.nextInt(3); 
                	Creature creature = null;
                    switch (choixCreature) {
                        case 0:
                        	creature = new Loup();
                            break;
                        case 1:
                        	creature = new Gobelin();
                            break;
                        case 2:
                        	creature = new Troll();
                            break;
                        default:
                    }
                    personnage.combattre(creature);
                    System.out.println("Votre personnage a combattu un " + creature.getNom() + ".");
                    if (creature.getPointsDeVie() <= 0) {
                        System.out.println("Votre personnage a gagné le combat et a obtenu " + creature.getScore() + " points.");
                    } else {
                        System.out.println("Votre personnage a perdu le combat.");
                    }
                }
                break;
            case 3:
            	if (personnage != null) {
                    System.out.println("Score actuel : " + personnage.getScore() + " points.");
                } else {
                    System.out.println("Aucun personnage n'a été créé.");
                }
                break;
            case 4:
                jouer = false;
                System.out.println("Merci d'avoir joué !");
                break;
            }
        }
	}
}



