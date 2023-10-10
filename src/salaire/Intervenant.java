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
	
	public  void afficherDonnees(Intervenant inter) {
		String salaire = String.valueOf(inter.getSalaire());	
		String statut = "";
		System.out.println("Nom : " + inter.nom);
		System.out.println("Prénom : " + inter.prenom);
		System.out.println("Salaire : " + salaire);
		if(inter instanceof Pigiste) {
			statut = "Pigiste";
		} else {
			statut = "Salarié";
		}
		System.out.println("Statut : " + statut);
	}

	@Override
	public String toString() {
		return "Intervenant [nom=" + nom + ", prenom=" + prenom + "]";
	}
}
