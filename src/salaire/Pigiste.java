package salaire;

public class Pigiste extends Intervenant{
	private double nbJoursTravailles;
	private double salaireParJour;
	
	/**
	 * @param nom
	 * @param prenom
	 * @param nbJoursTravailles
	 * @param salaireParJour
	 */
	public Pigiste(String nom, String prenom, double nbJoursTravailles, double salaireParJour) {
		super(nom, prenom);
		this.nbJoursTravailles = nbJoursTravailles;
		this.salaireParJour = salaireParJour;
	}
	
	public double getSalaire() {
		return this.nbJoursTravailles * this.salaireParJour;
	}
	
}
