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

	@Override
	public String toString() {
		return "Pigiste [nbJoursTravailles=" + nbJoursTravailles + ", salaireParJour=" + salaireParJour
				+ ", " + super.toString() + "]";
	}

	public double getSalaire() {
		return this.nbJoursTravailles * this.salaireParJour;
	}

	/**
	 * @return the nbJoursTravailles
	 */
	public double getNbJoursTravailles() {
		return nbJoursTravailles;
	}

	/**
	 * @param nbJoursTravailles the nbJoursTravailles to set
	 */
	public void setNbJoursTravailles(double nbJoursTravailles) {
		this.nbJoursTravailles = nbJoursTravailles;
	}

	/**
	 * @return the salaireParJour
	 */
	public double getSalaireParJour() {
		return salaireParJour;
	}

	/**
	 * @param salaireParJour the salaireParJour to set
	 */
	public void setSalaireParJour(double salaireParJour) {
		this.salaireParJour = salaireParJour;
	}
}
