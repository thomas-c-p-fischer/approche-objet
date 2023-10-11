package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {
		ArrayList<String> listeString = new ArrayList<String>();
		listeString.add("Nice");
		listeString.add("Carcassonne");
		listeString.add("Narbonne");
		listeString.add("Lyon");
		listeString.add("Foix");
		listeString.add("Pau");
		listeString.add("Marseille");
		listeString.add("Tarbes");
		
		String chainePlusGrande = "";
		
		for (String chaine : listeString) {
            if (chaine.length() > chainePlusGrande.length()) {
            	chainePlusGrande = chaine;
            }
        }
		System.out.println("La chaîne la plus longue est : " + chainePlusGrande);
		for(int i = 0; i < listeString.size(); i++) {
			String indexEnMaj = listeString.get(i).toUpperCase();
			listeString.set(i, indexEnMaj);
		}
		System.out.println(listeString);
		
		Iterator<String> iter = listeString.iterator();
		while(iter.hasNext()){
			String string = iter.next();
			if(string.charAt(0) == 'N') {
				iter.remove();
			}
		}
		System.out.println(listeString);
	}
}
