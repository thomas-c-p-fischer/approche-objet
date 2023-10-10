package essais;

import formes.Carre;
import formes.Cercle;
import formes.Rectangle;

public class TestForme {

	public static void main(String[] args) {
		Cercle cercle = new Cercle(5);
		Rectangle rectangle = new Rectangle(4.2, 5.2);
		Carre carre = new Carre(6.6);
		
		
		
		AffichageForme affichageDeLaForme = new AffichageForme();
		
		affichageDeLaForme.afficher(cercle);
		affichageDeLaForme.afficher(rectangle);
		affichageDeLaForme.afficher(carre);
	}

}
