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
	public double getSalaire() {
		return this.salaireMensuel;
	}
}
