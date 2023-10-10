package essais;

import entities.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {
		
		int numRueOrl = 17;
		String nomRueOrl = "Saint Louis";
		int codePostalOrl = 45240;
		String cityOrl = "Orléans";
		AdressePostale orleans = new AdressePostale(numRueOrl, nomRueOrl, codePostalOrl, cityOrl);
		int numRuelyn = 20;
		String nomRuelyn = "Au bois";
		int codePostallyn = 34000;
		String citylyn = "Lyon";
		
		AdressePostale lyon = new AdressePostale(numRuelyn, nomRuelyn, codePostallyn, citylyn);
		
		
		
		System.out.println(orleans.numero_de_rue);

	}
}
