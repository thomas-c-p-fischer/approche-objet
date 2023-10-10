package chaines;

import entities.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		String chaine = "Durand;Marcel;2 523.5";
		char premierCar = chaine.charAt(0);
		System.out.println("Le premier caractère de la chaîne de caractère est : " + premierCar);
		int taille = chaine.length();
		System.out.println("La taille de la chaîne de caractère est de : " + taille + " caractères.");
		int indexPointVirgule = chaine.indexOf(';');
		System.out.println("Le premier point virgule de la chaîne de caractère est à l'index  : " + indexPointVirgule);
		String nomDeFamille = chaine.substring(chaine.indexOf('D'), indexPointVirgule);
		System.out.println("Le nom de famille est  : " + nomDeFamille);
		System.out.println("Le nom de famille est  : " + nomDeFamille.toUpperCase());
		System.out.println("Le nom de famille est  : " + nomDeFamille.toLowerCase());
		String[] separation =chaine.split(";");
		for(int i = 0; i < separation.length; i++) {
			System.out.println(separation[i]);
		}
		String nomDurand = separation[0];
		String prenomMarcel = separation[1];
		String suppressionEspace = separation[2].replace(" ", "");
		double salaireDeDuMa = Double.parseDouble(suppressionEspace);
		Salarie mrDurand = new Salarie(nomDurand, prenomMarcel, salaireDeDuMa);
		System.out.println(mrDurand);
	}

}
