package essais;

import maison.Chambre;
import maison.Cuisine;
import maison.Maison;
import maison.SalleDeBain;
import maison.Salon;
import maison.Wc;

public class TestMaison {

	public static void main(String[] args) {
		Chambre chambreBebe = new Chambre(10.2, 1);
		Chambre chambreBebe3 = new Chambre(10.2, 1);
		Chambre chambreBebe2 = new Chambre(10.2, 1);
		Salon salonRdc = new Salon(2.0, 0);
		Cuisine cuisineRdc = new Cuisine(10.6, 0);
		SalleDeBain salleDeBain1 = new SalleDeBain(6.8, 1);
		Wc wc3 = new Wc(4.2, 2);
		
		Maison maison = new Maison();
		maison.ajouterPiece(chambreBebe);
		maison.ajouterPiece(chambreBebe3);
		maison.ajouterPiece(chambreBebe2);
		maison.ajouterPiece(salonRdc);
		maison.ajouterPiece(cuisineRdc);
		maison.ajouterPiece(salleDeBain1);
		maison.ajouterPiece(wc3);
		
		System.out.println("Superficie RDC : " + maison.superficieEtage(0));
		System.out.println("Superficie 1er étage : " + maison.superficieEtage(1));
		System.out.println("Superficie 2ème étage : " + maison.superficieEtage(2));
		System.out.println("Superficie totale de la maison : " + maison.superficieTotaleMaison());
		System.out.println("Superficie de toutes les chambres : " + maison.superficieSelonTypeDePiece("Chambre"));
		System.out.println("Nombre des chambres : " + maison.nbPiecesSelonType("Chambre"));
	}

}
