package maison;

public class Maison {
	 private Piece[] maison = new Piece[0];
	
	public void ajouterPiece(Piece piece) {
		int taille = maison.length + 1;
		Piece[] maisonTemporaire = new Piece[taille];
		if(piece != null) {
			for(int i = 0; i < maison.length; i++) {
				maisonTemporaire[i] = maison[i];
			}
			maisonTemporaire[taille - 1] = piece;
			maison = maisonTemporaire;
		} else {
			System.out.println("aucune pièces !");
		}
	}
	
	public double superficieTotaleMaison() {
		double superficieTotal = 0.0;
		for(int i = 0; i < maison.length; i++) {
			superficieTotal += maison[i].getSuperficie();
		}
		return superficieTotal;
	}
	
	public double superficieEtage(int numEtage) {
		double superficieEtage = 0.0;
		
		for(int i = 0; i < maison.length; i++) {
			if(maison[i].getNumeroEtage() == numEtage)
			superficieEtage += maison[i].getSuperficie();
		}
		return superficieEtage;
	}
	
	public double superficieSelonTypeDePiece(String type) {
		double superficieType = 0.0;
		for(int i = 0; i < maison.length; i++) {
			if(maison[i].getType() == type) {
				superficieType += maison[i].getSuperficie();
			} else if (type == null) {
		            throw new IllegalArgumentException("Le type de pièce ne peut pas être null.");
			}
		}
		return superficieType;
	}
	
	public int nbPiecesSelonType(String type) {
		int nbPieces = 0;
		for(int i = 0; i < maison.length; i++) {
			if(maison[i].getType() == type) {
				nbPieces ++;
			} else if (type == null) {
		            throw new IllegalArgumentException("Le type de pièce ne peut pas être null.");
			}
		}
		return nbPieces;
	}
}
