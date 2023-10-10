package essais;

import entities.AdressePostale;
import entities.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		String name = "Jean";
		String surname = "Maurice";
		int numRuelyn = 20;
		String nomRuelyn = "Au bois";
		int codePostallyn = 34000;
		String citylyn = "Lyon";
		AdressePostale lyon = new AdressePostale(numRuelyn, nomRuelyn, codePostallyn, citylyn);
		
		String name1 = "Isidor";
		String surname1 = "Jules";
		int numRueOrl = 17;
		String nomRueOrl = "Saint Louis";
		int codePostalOrl = 45240;
		String cityOrl = "Orléans";
		AdressePostale orleans = new AdressePostale(numRueOrl, nomRueOrl, codePostalOrl, cityOrl);
		
		Personne mrX = new Personne(name, surname, lyon);
		Personne mrY = new Personne(name1, surname1, orleans);
		
		mrX.afficherNomMajPrenom(surname1, name1);
		mrY.setAdresse(orleans);
		System.out.println(mrY.getPrenom());
		System.out.println(mrX.getNom());
		mrX.setNom("Elliot");
		mrY.setPrenom("Billy");
		System.out.println(mrX);
		System.out.println(mrY);
	}

}
