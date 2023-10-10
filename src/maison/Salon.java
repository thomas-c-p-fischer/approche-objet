package maison;

public class Salon extends Piece {

	/**
	 * @param superficie
	 * @param numeroEtage
	 */
	public Salon(double superficie, Integer numeroEtage) {
		super(superficie, numeroEtage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Salon [" + super.toString() + "]";
	}
	
	public String getType() {
		return "Salon";
	}

}
