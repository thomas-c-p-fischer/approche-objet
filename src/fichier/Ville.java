package fichier;

public class Ville {
	private String nom;
	private String codeDpt;
	private String nomDeLaRegion;
	private String populationTotale;
	/**
	 * @param nom
	 * @param codeDpt
	 * @param nomDeLaRegion
	 * @param populationTotale
	 */
	public Ville(String nom, String codeDpt, String nomDeLaRegion, String populationTotale) {
		super();
		this.nom = nom;
		this.codeDpt = codeDpt;
		this.nomDeLaRegion = nomDeLaRegion;
		this.populationTotale = populationTotale;
	}
	@Override
	public String toString() {
		return nom + " - " + codeDpt + " - " + nomDeLaRegion + " - ;" + populationTotale;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the codeDpt
	 */
	public String getCodeDpt() {
		return codeDpt;
	}
	/**
	 * @param codeDpt the codeDpt to set
	 */
	public void setCodeDpt(String codeDpt) {
		this.codeDpt = codeDpt;
	}
	/**
	 * @return the nomDeLaRegion
	 */
	public String getNomDeLaRegion() {
		return nomDeLaRegion;
	}
	/**
	 * @param nomDeLaRegion the nomDeLaRegion to set
	 */
	public void setNomDeLaRegion(String nomDeLaRegion) {
		this.nomDeLaRegion = nomDeLaRegion;
	}
	/**
	 * @return the populationTotale
	 */
	public String getPopulationTotale() {
		return populationTotale;
	}
	/**
	 * @param populationTotale the populationTotale to set
	 */
	public void setPopulationTotale(String populationTotale) {
		this.populationTotale = populationTotale;
	}
	
}
