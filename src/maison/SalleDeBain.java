package maison;

public class SalleDeBain extends Piece {

	/**
	 * @param superficie
	 * @param numeroEtage
	 */
	public SalleDeBain(double superficie, Integer numeroEtage) {
		super(superficie, numeroEtage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SalleDeBain [" + super.toString() + "]";
	}
	
	public String getType() {
		return "SalleDeBain";
	}

}
