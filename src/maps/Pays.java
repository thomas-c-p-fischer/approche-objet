package maps;

public class Pays {
	private String nomn;
	private long nbHab;
	private String continent;
	
	/**
	 * @param nomn
	 * @param nbHab
	 * @param continent
	 */
	public Pays(String nomn, long nbHab, String continent) {
		super();
		this.nomn = nomn;
		this.nbHab = nbHab;
		this.continent = continent;
	}
	@Override
	public String toString() {
		return "Pays [nomn=" + nomn + ", nbHab=" + nbHab + ", continent=" + continent + "]";
	}
	/**
	 * @return the nomn
	 */
	public String getNomn() {
		return nomn;
	}
	/**
	 * @param nomn the nomn to set
	 */
	public void setNomn(String nomn) {
		this.nomn = nomn;
	}
	/**
	 * @return the nbHab
	 */
	public long getNbHab() {
		return nbHab;
	}
	/**
	 * @param nbHab the nbHab to set
	 */
	public void setNbHab(long nbHab) {
		this.nbHab = nbHab;
	}
	/**
	 * @return the continent
	 */
	public String getContinent() {
		return continent;
	}
	/**
	 * @param continent the continent to set
	 */
	public void setContinent(String continent) {
		this.continent = continent;
	}
}
