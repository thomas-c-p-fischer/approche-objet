package formes;

public class Rectangle extends Forme {
	private double longueur;
	private double largeur;
	
	@Override
	public double calculSurface() {
		double surface = longueur * largeur;
		return surface;
	}
	
	@Override
	public double calculPerimetre() {
		double perimetre = 2 * (longueur + largeur);
		return perimetre;
	}
	
	/**
	 * @param longueur
	 * @param largeur
	 */
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	public Rectangle(double cote) {
        this.longueur = cote;
        this.largeur = cote;
    }

	@Override
	public String toString() {
		return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + "]";
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

	/**
	 * @return the largeur
	 */
	public double getLargeur() {
		return largeur;
	}

	/**
	 * @param largeur the largeur to set
	 */
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
}
