package operations;

public class Operations {
	public static double calculette(double a, double b, char operateur) {
		double resultat = 0;
		switch(operateur) {
			case '+' : 
				resultat = a + b;
				break;
			case '-' :
				resultat = a - b;
				break;
			case '*' :
				resultat = a * b;
				break;
			case '/' :
				resultat = a / b;
				break;
		}
		return resultat;
	}	
}
