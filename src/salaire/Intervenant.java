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
	
	public abstract String getStatut();
	
	public final  void afficherDonnees() {
		System.out.println("Nom : " + nom);
		System.out.println("Prénom : " + prenom);
		System.out.println("Salaire : " + getSalaire());
		System.out.println("Statut : " + getStatut());
	}

	@Override
	public String toString() {
		return "Intervenant [nom=" + nom + ", prenom=" + prenom + "]";
	}
}
