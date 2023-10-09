package banque;

import entities.Compte;
import entities.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		String numCompte = "1111111111111111";
		String soldeCompte = "100,00€";
		String numCompteTaux = "222222222222";
		String soldeCompteTaux = "100000,00€";
		Compte monCompte = new Compte(numCompte, soldeCompte);
		
		Compte[] comptes = new Compte[2];
		comptes[0] = monCompte;
		
		CompteTaux monCompteTaux = new CompteTaux(numCompteTaux, soldeCompteTaux, 100);
		
		comptes[1] = monCompteTaux;
		
		for(int i = 0; i < 2; i++) {
			System.out.println(comptes[i]);
		}
	}
}
