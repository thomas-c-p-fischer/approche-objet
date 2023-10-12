package maps;

import java.util.ArrayList;
import java.util.HashMap;

public class ComptagePaysParContinent {

	public static void main(String[] args) {
		ArrayList<Pays> paysListe = new ArrayList<>();
		paysListe.add(new Pays("France", 65000000L, "Europe"));
		paysListe.add(new Pays("Allemagne", 80000000L, "Europe"));
		paysListe.add(new Pays("Belgique", 10000000L, "Europe"));
		paysListe.add(new Pays("Russie", 150000000L, "Asie"));
		paysListe.add(new Pays("Chine", 1400000000L, "Asie"));
		paysListe.add(new Pays("Indonésie", 220000000, "Océanie"));
		paysListe.add(new Pays("Australie", 65000000, "Océanie"));
		
		HashMap<String, Integer> cpt = new HashMap<String, Integer>();
		
		for(Pays p : paysListe) {
			String continent = p.getContinent();
			cpt.put(continent, cpt.getOrDefault(continent, 0) + 1);
		}
		for(String continent : cpt.keySet()) {
			int nbPays = cpt.get(continent);
			System.out.println(continent + ": " + nbPays + " pays.");
		}
	}
}
