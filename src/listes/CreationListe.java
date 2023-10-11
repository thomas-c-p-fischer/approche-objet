package listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {
		ArrayList<Integer> listeEntier = new ArrayList<Integer>();
		int i = 0;
		while(i < 101) {
			listeEntier.add(i);
			System.out.println(listeEntier.get(i));
			i++;
		}
		System.out.println(listeEntier.size());
	}
}