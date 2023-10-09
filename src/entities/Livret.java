package entities;

public class Livret extends Compte {
	private String type;

	/**
	 * @param numeroDeCompte
	 * @param soldeDuCompte
	 * @param type
	 */
	public Livret(String numeroDeCompte, String soldeDuCompte, String type) {
		super(numeroDeCompte, soldeDuCompte);
		this.type = type;
	}

	@Override
	public String toString() {
		return "Livret [type=" + type + ", " + super.toString() + "]";
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
}
