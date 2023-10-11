package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetString {

	public static void main(String[] args) {
		HashSet<String> setString = new HashSet<String>();
		setString.add("USA");
		setString.add("France");
		setString.add("Allemagne");
		setString.add("UK");
		setString.add("Italie");
		setString.add("Japon");
		setString.add("Chine");
		setString.add("Russie");
		setString.add("Inde");
		
		Iterator<String> iter = setString.iterator();
		String chainePlusGrande = "";
		int longueurMax = 0;
		
		while(iter.hasNext()) {
			String paysActuel = iter.next();
			if(paysActuel.length() > longueurMax) {
				longueurMax = paysActuel.length();
				chainePlusGrande = paysActuel;
			}
		}
		iter = setString.iterator();
        while (iter.hasNext()) {
            String paysActuel = iter.next();
            if (paysActuel.equals(chainePlusGrande)) {
                iter.remove();
            }
        }
        System.out.println(setString);
	}
}
