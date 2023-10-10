package maison;

public class Cuisine extends Piece {

	/**
	 * @param superficie
	 * @param numeroEtage
	 */
	public Cuisine(double superficie, Integer numeroEtage) {
		super(superficie, numeroEtage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cuisine [" + super.toString() + "]";
	}
	
	public String getType() {
		return "Cuisine";
	}

}
