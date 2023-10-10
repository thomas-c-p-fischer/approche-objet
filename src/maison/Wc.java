package maison;

public class Wc extends Piece {

	/**
	 * @param superficie
	 * @param numeroEtage
	 */
	public Wc(double superficie, Integer numeroEtage) {
		super(superficie, numeroEtage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Wc [" + super.toString() + "]";
	}
	
	public String getType() {
		return "Wc";
	}

}
