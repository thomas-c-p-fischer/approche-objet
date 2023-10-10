package essais;

import salaire.Pigiste;
import salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		Salarie salarieX = new Salarie("John", "Joe", 1684.25);
		Pigiste pigisteY = new Pigiste("Jane", "Jeanne", 24, 76.16);
		salarieX.afficherDonnees(salarieX);
		pigisteY.afficherDonnees(pigisteY);

	}

}
