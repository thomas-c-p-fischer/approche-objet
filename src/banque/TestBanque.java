package banque;

import entities.Compte;

public class TestBanque {

	public static void main(String[] args) {
		String numCompte = "1111111111111111";
		String soldeCompte = "100,00€";
		Compte monCompte = new Compte(numCompte, soldeCompte);
		
		System.out.println(monCompte);
	}

}
