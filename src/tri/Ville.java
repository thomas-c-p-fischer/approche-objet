package tri;

public class Ville implements Comparable<Ville> {
	private String nom;
	private Integer nombreHabitants;

	@Override
	public int compareTo(Ville autreVille) {
		return this.nombreHabitants.compareTo(autreVille.getNombreHabitants());
	}
	
	/**
	 * @param nom
	 * @param nombreHabitants
	 */
	public Ville(String nom, Integer nombreHabitants) {
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
	public Integer getNombreHabitants() {
		return nombreHabitants;
	}

	/**
	 * @param nombreHabitants the nombreHabitants to set
	 */
	public void setNombreHabitants(Integer nombreHabitants) {
		this.nombreHabitants = nombreHabitants;
	}
}
