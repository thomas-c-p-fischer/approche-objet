package maison;

public class Chambre extends Piece {

	/**
	 * @param superficie
	 * @param numeroEtage
	 */
	public Chambre(double superficie, Integer numeroEtage) {
		super(superficie, numeroEtage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Chambre [" + super.toString() + "]";
	}
	
	public String getType() {
		return "Chambre";
	}
	
}
