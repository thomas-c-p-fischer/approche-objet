package entities;

public class TestPersonne {

	public static void main(String[] args) {
		String name = "Jean";
		String surname = "Maurice";
		int numRuelyn = 20;
		String nomRuelyn = "Au bois";
		int codePostallyn = 34000;
		String citylyn = "Lyon";
		AdressePostale lyon = new AdressePostale(numRuelyn, nomRuelyn, codePostallyn, citylyn);
		Personne mrX = new Personne(name, surname, lyon);
		Personne mrY = new Personne(name, surname, lyon);
	}

}
