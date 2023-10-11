package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeInt {

	public static void main(String[] args) {
		ArrayList<Integer> listeEntier = new ArrayList<Integer>();
		listeEntier.add(-1);
		listeEntier.add(5);
		listeEntier.add(7);
		listeEntier.add(3);
		listeEntier.add(-2);
		listeEntier.add(4);
		listeEntier.add(8);
		listeEntier.add(5);
		
		System.out.println(listeEntier + ", " + listeEntier.size());
		
		int plusGrand = Collections.max(listeEntier);
		System.out.println(plusGrand);
		
		int plusPetit = Collections.min(listeEntier);
		System.out.println(plusPetit);
		
		for(int i = 0; i < listeEntier.size(); i++) {
			if(listeEntier.get(i) < 0) {
				listeEntier.set(i, Math.abs(listeEntier.get(i)));
			}
		}
		System.out.println(listeEntier);
	}
}
