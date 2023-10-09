package entities;

public class CompteTaux extends Compte {
	private int tauxDeRemuneration;

	/**
	 * @param numeroDeCompte
	 * @param soldeDuCompte
	 */
	public CompteTaux(String numeroDeCompte, String soldeDuCompte, int tauxDeRemuneration) {
		super(numeroDeCompte, soldeDuCompte);
		this.tauxDeRemuneration = tauxDeRemuneration;
	}

	@Override
	public String toString() {
		return "CompteTaux [tauxDeRemuneration=" + tauxDeRemuneration + ", " + super.toString() + "]";
	}

	/**
	 * @return the tauxDeRemuneration
	 */
	public int getTauxDeRemuneration() {
		return tauxDeRemuneration;
	}

	/**
	 * @param tauxDeRemuneration the tauxDeRemuneration to set
	 */
	public void setTauxDeRemuneration(int tauxDeRemuneration) {
		this.tauxDeRemuneration = tauxDeRemuneration;
	}
}
