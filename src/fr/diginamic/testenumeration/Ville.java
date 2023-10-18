package fr.diginamic.testenumeration;

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
	
	private Continents continent;

	/** Constructeur
	 * @param nom
	 * @param population
	 * @param continent
	 */
	public Ville(String nom, int population, Continents continent) {
		super();
		this.nom = nom;
		this.population = population;
		this.continent = continent;
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
		return "Ville [nom=" + nom + ", population=" + population + ", continent=" + continent + "]";
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
	
	public Continents getContinent() {
		return continent;
	}

	public void setContinent(Continents continent) {
		this.continent = continent;
	}
}
