package essais;

import formes.Forme;

public class AffichageForme {
	
	public void afficher(Forme forme) {
		double perimetre = forme.calculPerimetre();
		double surface = forme.calculSurface();		
		System.out.println("Le périmètre : " + perimetre + "m. La Surface : " + surface + "m².");
	}

}
