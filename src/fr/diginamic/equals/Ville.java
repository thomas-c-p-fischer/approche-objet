package fr.diginamic.equals;

/**
 * 
 */
/**
 * 
 */
public class Ville {
	/** nom  */
	private String nom;
	/** population  */
	private int population;
	

	/** Constructeur
	 * @param nom
	 * @param population
	 */
	public Ville(String nom, int population) {
		super();
		this.nom = nom;
		this.population = population;
	}
	
	@Override
    public boolean equals(Object obj) {
       if(!(obj instanceof Ville)) {
    	   return false;
       }
		Ville ville = (Ville)obj;
       return this.nom.equals(ville.getNom())  && this.population == ville.getPopulation();
    }
    
	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", population=" + population + "]";
	}

	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}

	/** Setter
	 * @param population the population to set
	 */
	public void setPopulation(int population) {
		this.population = population;
	}
}
