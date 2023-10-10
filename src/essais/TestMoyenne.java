package essais;

import operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		CalculMoyenne calculatrice = new CalculMoyenne();
		
		calculatrice.ajouterNotes(12.5);
		calculatrice.ajouterNotes(10);
		calculatrice.ajouterNotes(6.5);
		calculatrice.ajouterNotes(20);
		
		double moyenne = calculatrice.calculMoyenne();
		System.out.println("Moyenne : " + moyenne);
	}

}
