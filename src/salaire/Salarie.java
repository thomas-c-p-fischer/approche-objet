package salaire;

public class Salarie extends Intervenant {
	private double salaireMensuel;

	/**
	 * @param nom
	 * @param prenom
	 * @param salaireMensuel
	 */
	public Salarie(String nom, String prenom, double salaireMensuel) {
		super(nom, prenom);
		this.salaireMensuel = salaireMensuel;
	}
	
	@Override
	public String toString() {
		return "Salarie [salaireMensuel=" + salaireMensuel + ", " + super.toString() + "]";
	}

	@Override
	public double getSalaire() {
		return this.salaireMensuel;
	}
	
	public String getStatut() {
		return "salarié";
	}

	/**
	 * @return the salaireMensuel
	 */
	public double getSalaireMensuel() {
		return salaireMensuel;
	}

	/**
	 * @param salaireMensuel the salaireMensuel to set
	 */
	public void setSalaireMensuel(double salaireMensuel) {
		this.salaireMensuel = salaireMensuel;
	}
}
