package entities;

public class AdressePostale {
	public int numero_de_rue;
	public String libelle_de_la_rue;
	public int code_postal;
	public String ville;
	
	AdressePostale(int numRue, String nomRue, int codePostal, String city) {
		numero_de_rue = numRue;
		libelle_de_la_rue = nomRue;
		code_postal = codePostal;
		ville = city;
	}
}
