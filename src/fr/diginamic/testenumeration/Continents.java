package fr.diginamic.testenumeration;

public enum Continents {
	EUROPE("Europe"),
	ASIE("Asie"),
	AMERIQUE("Amérique"),
	AFRIQUE("Afrique"),
	OCEANIE("Océanie");
	
	/** Libelle du continent */
	private String libelle;

	/**
	 * @param libelle
	 */
	private Continents(String libelle) {
		this.libelle = libelle;
	}

	public String getLibelle() {
		return libelle;
	}
}
