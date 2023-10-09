package utils;

import entities.Cercle;

public class CercleFactory {
	public static Cercle usineACercle(double rayon) {
		Cercle cercle = new Cercle(rayon);
		return cercle;	
	}
}
