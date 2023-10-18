package fr.diginamic.testenumeration;

public class TestEnum {

	public static void main(String[] args) {
		Saison[] saisons = Saison.values();
		String nom = "ETE";
		String libelle = "Hiver";
		
		// Parcourt le tableaux de saisons pour afficher toutes les saisons
		for(Saison s : saisons) {
			System.out.println(s.getLibelle()); 
		}
		
		// Création d'une instance de Saison qui a pour valeur "ETE" et on y affiche le libelle
		Saison saisonEte = Saison.valueOf(nom);
		System.out.println(saisonEte.getLibelle());
		
		// Utilisation de la méthode crée dans Saison.java pour retourner une saion en fonction de son libelle
		Saison saisonHiver = Saison.getSaisonByLibelle(libelle);
		System.out.println(saisonHiver);
	}
}