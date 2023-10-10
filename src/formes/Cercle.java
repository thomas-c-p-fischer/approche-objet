package formes;

public class Cercle extends Forme {
	private double rayon;
	
	public double calculPerimetre() {
		double perimetre = 2 * Math.PI * getRayon();
		return perimetre;
	}
	
	public double calculSurface() {
		double surface = Math.PI * getRayon() * getRayon();
		return surface;
	}
	
	/**
	 * @param rayon
	 */
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	@Override
	public String toString() {
		return "Cercle [rayon=" + rayon + ", périmètre=" + calculPerimetre() + ", surface=" + Math.round(calculSurface() * 100.0)/100.0 + " mètres carrés.]";
	}

	/**
	 * @return the rayon
	 */
	public double getRayon() {
		return rayon;
	}

	/**
	 * @param rayon the rayon to set
	 */
	public void setRayon(double rayon) {
		this.rayon = rayon;
	} 
	
}
