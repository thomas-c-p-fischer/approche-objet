package formes;

public class Carre extends Forme {
	private double longueur;
	
	@Override
	public double calculSurface() {
		double surface = longueur * longueur;
		return surface;
	}
	
	@Override
	public double calculPerimetre() {
		double perimetre = 4 * longueur;
		return perimetre;
	}
	
	/**
	 * @param longueur
	 */
	public Carre(double longueur) {
		super();
		this.longueur = longueur;
	}

	@Override
	public String toString() {
		return "Carre [longueur=" + longueur + "]";
	}

	/**
	 * @return the longueur
	 */
	public double getLongueur() {
		return longueur;
	}

	/**
	 * @param longueur the longueur to set
	 */
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}
}
