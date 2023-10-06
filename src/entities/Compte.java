package entities;

public class Compte {
	private String numeroDeCompte;
	private String soldeDuCompte;
	
	/**
	 * @param numeroDeCompte
	 * @param soldeDuCompte
	 */
	public Compte(String numeroDeCompte, String soldeDuCompte) {
		super();
		this.numeroDeCompte = numeroDeCompte;
		this.soldeDuCompte = soldeDuCompte;
	}
		
	@Override
	public String toString() {
		return "Compte [numeroDeCompte=" + numeroDeCompte + ", soldeDuCompte=" + soldeDuCompte + "]";
	}

	public String getNumeroDeCompte() {
		return numeroDeCompte;
	}
	public void setNumeroDeCompte(String numeroDeCompte) {
		this.numeroDeCompte = numeroDeCompte;
	}
	public String getSoldeDuCompte() {
		return soldeDuCompte;
	}
	public void setSoldeDuCompte(String soldeDuCompte) {
		this.soldeDuCompte = soldeDuCompte;
	}
		
}
