package fr.diginamic.equals;

public class TestEquals {

	public static void main(String[] args) {
		// Equlas identiques
		Ville ville1 = new Ville("Pau", 150);
		Ville ville2 = new Ville("Pau", 150);
		if(ville1.equals(ville2)) {
			System.out.println("identique");
		} else {
			System.out.println("différents");
		}
		
		// Equals avec une différence
		Ville ville3 = new Ville("Pau", 150);
		Ville ville4 = new Ville("Pau", 1500);
		if(ville3.equals(ville4)) {
			System.out.println("identique");
		} else {
			System.out.println("différents");
		}
		
		// Opérateur == 
		Ville ville5 = new Ville("Pau", 150);
		Ville ville6 = new Ville("Pau", 150);
		if(ville5 == ville6) {
			System.out.println("identique");
		} else {
			System.out.println("différents");
		}
		
		//Opérateur == pour que ça return true
		Ville ville7 = new Ville("Pau", 150);
		Ville ville8 = ville7;
		if(ville7 == ville8) {
			System.out.println("identique");
		} else {
			System.out.println("différents");
		}
	}
}