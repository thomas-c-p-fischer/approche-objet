package salaire;

public abstract class Intervenant {
	private String nom;
	private String prenom;
	
	/**
	 * @param nom
	 * @param prenom
	 */
	public Intervenant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public abstract double getSalaire();
	
}
