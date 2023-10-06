package entities;

public class TestAdressePostale {

	public static void main(String[] args) {
		int numRueOrl = 17;
		String nomRueOrl = "Saint Louis";
		int codePostalOrl = 45240;
		String cityOrl = "Orléans";		
		AdressePostale orleans = new AdressePostale(numRueOrl, nomRueOrl, codePostalOrl, cityOrl);
		System.out.println(orleans.numero_de_rue);

	}

}
