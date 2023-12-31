package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		// Initialisation du chronomètre
		long debut = System.currentTimeMillis();
		// Construction et ajout des valeurs au StringBuilder
		StringBuilder builder = new StringBuilder();
		for (int i = 1; i <= 100000; i++) {
            builder.append(i)
            			.append("-");
        }
		// Fin du chronomètre
		long fin = System.currentTimeMillis();
		// Affichage du chrono
		System.out.println("Temps écoulé en millisecondes pour le StringBuilder :" + (fin - debut));
			
		long debut1 = System.currentTimeMillis();
		String resultat = "";
		for (int i = 1; i <= 100000; i++) {
            resultat+= i;
        }
		long fin1 = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes pour la String :" + (fin1 - debut1));
	}

}
