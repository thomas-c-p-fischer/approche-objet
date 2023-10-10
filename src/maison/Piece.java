package maison;

public abstract class Piece {
	private double superficie;
	private Integer numeroEtage;
	private String type;
	
	/**
	 * @param superficie
	 * @param numeroEtage
	 */
	public Piece(double superficie, Integer numeroEtage) {
		super();
		if (superficie < 0 || superficie == 0.0) {
            throw new IllegalArgumentException("La superficie ne peut pas être ni négative ni null.");
        }
        if (numeroEtage == null) {
            throw new IllegalArgumentException("Le numéro d'étage ne peut pas être null.");
        }
		this.superficie = superficie;
		this.numeroEtage = numeroEtage;
	}

	/**
	 * @return the superficie
	 */
	public double getSuperficie() {
		return superficie;
	}

	/**
	 * @param superficie the superficie to set
	 */
	public void setSuperficie(double superficie) {
		if (superficie < 0 || superficie == 0.0) {
            throw new IllegalArgumentException("La superficie ne peut pas être ni négative ni null.");
        }
		this.superficie = superficie;
	}

	/**
	 * @return the numeroEtage
	 */
	public Integer getNumeroEtage() {
		return numeroEtage;
	}

	/**
	 * @param numeroEtage the numeroEtage to set
	 */
	public void setNumeroEtage(Integer numeroEtage) {
		if (numeroEtage == null) {
            throw new IllegalArgumentException("Le numéro d'étage ne peut pas être null.");
        }
		this.numeroEtage = numeroEtage;
	}

	@Override
	public String toString() {
		return "Piece [superficie=" + superficie + ", numeroEtage=" + numeroEtage + "]";
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	
}
