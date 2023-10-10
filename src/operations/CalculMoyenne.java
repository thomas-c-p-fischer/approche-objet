package operations;

public class CalculMoyenne {
	
	private static double[] notes;
	private static int taille;
	private static double somme;
	
	public  CalculMoyenne() {
		notes = new double[10];
		taille = 0;
		somme = 0.0;
	}
	
	public static void ajouterNotes(double monDouble) {
		if(taille == notes.length) {
			double[] tableauDeNotesTemporaire = new double[notes.length +1];
			System.arraycopy(notes, 0, tableauDeNotesTemporaire, 0, notes.length);
			notes = tableauDeNotesTemporaire;
		}
		notes[taille] = monDouble;
		somme += monDouble;
		taille++;
	}
	
	public static double calculMoyenne() {
		double moyenne = 0.0;
		if(taille == 0) { 
			return moyenne;
		}
		moyenne = somme / taille;
		return moyenne;
	}
}
