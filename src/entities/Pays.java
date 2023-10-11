package entities;

public class Pays {
	private String nom;
	private Long nombreHabitant;
	private double pibHab;
	/**
	 * @param nom
	 * @param nombreHabitant
	 * @param pib
	 */
	public Pays(String nom, Long nombreHabitant, double pibHab) {
		super();
		this.nom = nom;
		this.nombreHabitant = nombreHabitant;
		this.pibHab = pibHab;
	}
	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", nombreHabitant=" + nombreHabitant + ", pibHab=" + pibHab + "]";
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the nombreHabitant
	 */
	public Long getNombreHabitant() {
		return nombreHabitant;
	}
	/**
	 * @param nombreHabitant the nombreHabitant to set
	 */
	public void setNombreHabitant(Long nombreHabitant) {
		this.nombreHabitant = nombreHabitant;
	}
	/**
	 * @return the pib
	 */
	public double getPibHab() {
		return pibHab;
	}
	/**
	 * @param pib the pib to set
	 */
	public void setPibHab(double pibHab) {
		this.pibHab = pibHab;
	}
	
}
