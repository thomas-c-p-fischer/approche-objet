package entities;

public class Ville {
	private String nom;
	private int nombreHabitants;
	
	/**
	 * @param nom
	 * @param nombreHabitants
	 */
	public Ville(String nom, int nombreHabitants) {
		super();
		this.nom = nom;
		this.nombreHabitants = nombreHabitants;
	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nombreHabitants=" + nombreHabitants + "]";
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
	 * @return the nombreHabitants
	 */
	public int getNombreHabitants() {
		return nombreHabitants;
	}

	/**
	 * @param nombreHabitants the nombreHabitants to set
	 */
	public void setNombreHabitants(int nombreHabitants) {
		this.nombreHabitants = nombreHabitants;
	}
}
