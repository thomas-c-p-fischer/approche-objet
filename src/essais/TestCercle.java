package essais;

import formes.Cercle;
import utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		Cercle cercle1 = new Cercle(10);
		Cercle cercle2 = new Cercle(20);
		System.out.println("Le premier cercle : " + cercle1 + ", le deuxième cercle : " + cercle2);
		
		Cercle cercle3 = CercleFactory.usineACercle(12);
		System.out.println(cercle3);
	}
}
