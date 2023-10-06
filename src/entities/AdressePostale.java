package entities;

public class AdressePostale {
	public int numero_de_rue;
	public String libelle_de_la_rue;
	public int code_postal;
	public String ville;
	
	public int getNumero_de_rue() {
		return numero_de_rue;
	}

	public void setNumero_de_rue(int numero_de_rue) {
		this.numero_de_rue = numero_de_rue;
	}

	public String getLibelle_de_la_rue() {
		return libelle_de_la_rue;
	}

	public void setLibelle_de_la_rue(String libelle_de_la_rue) {
		this.libelle_de_la_rue = libelle_de_la_rue;
	}

	public int getCode_postal() {
		return code_postal;
	}

	public void setCode_postal(int code_postal) {
		this.code_postal = code_postal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public AdressePostale(int numRue, String nomRue, int codePostal, String city) {
		numero_de_rue = numRue;
		libelle_de_la_rue = nomRue;
		code_postal = codePostal;
		ville = city;
	}

	@Override
	public String toString() {
		return "AdressePostale [numero_de_rue=" + numero_de_rue + ", libelle_de_la_rue=" + libelle_de_la_rue
				+ ", code_postal=" + code_postal + ", ville=" + ville + "]";
	}
}
