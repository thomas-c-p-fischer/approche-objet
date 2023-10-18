package fr.diginamic.testenumeration;

public enum Saison {
	PRINTEMPS("Printemps", 1),
	ETE("Eté", 2),
	AUTOMNE("Automne", 3),
	HIVER("Hiver", 4);
	
	/** Libellé de la saison */
	private String libelle;
	/** Numéro dans l'ordre de la saison */
	private int numeroOrdre;
	
	/** Constructeur
	 * @param libelle
	 * @param numeroOrdre
	 */
	private Saison(String libelle, int numeroOrdre) {
		this.libelle = libelle;
		this.numeroOrdre = numeroOrdre;
	}

	public static Saison getSaisonByLibelle(String libelle) {
		for(Saison s : values()) {
			if(s.getLibelle().equalsIgnoreCase(libelle)) {
				return s;
			}
		}
		return null;
	}
	
	public String getLibelle() {
		return libelle;
	}

	public int getNumeroOrdre() {
		return numeroOrdre;
	}	
}
