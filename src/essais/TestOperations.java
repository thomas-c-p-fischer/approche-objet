package essais;

import operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		double addition = Operations.calculette(10.2, 25.6, '+');
		double soustraction = Operations.calculette(10.2, 25.6, '-');
		double division = Operations.calculette(10.2, 25.6, '/');
		double multiplication = Operations.calculette(10.2, 25.6, '*');
		System.out.println("addition=" + addition +", soustraction=" +  soustraction + ", multiplication=" +  multiplication + ", division=" + division);
	}

}
