package utils;

import formes.Cercle;

public class CercleFactory {
	public static Cercle usineACercle(double rayon) {
		Cercle cercle = new Cercle(rayon);
		return cercle;	
	}
}
