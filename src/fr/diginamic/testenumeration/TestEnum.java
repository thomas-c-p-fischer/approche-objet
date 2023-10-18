package fr.diginamic.testenumeration;

public class TestEnum {

	public static void main(String[] args) {
		Saison[] saisons = Saison.values();
		String nom = "ETE";
		String libelle = "Hiver";
		
		for(Saison s : saisons) {
			System.out.println(s.getLibelle()); 
		}
		
		Saison saisonEte = Saison.valueOf(nom);
		System.out.println(saisonEte.getLibelle());
		
		Saison saisonHiver = Saison.getSaisonByLibelle(libelle);
		System.out.println(saisonHiver);
	}
}