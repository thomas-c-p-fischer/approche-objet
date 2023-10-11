package maps;

import java.util.HashMap;
import java.util.Iterator;

import entities.Ville;

public class MapVilles {

	public static void main(String[] args) {
		
		HashMap<String, Ville> villes = new HashMap<String, Ville>();
		
		villes.put("Nice", new Ville("Nice", 343000));
        villes.put("Carcassonne", new Ville("Carcassonne", 47800));
        villes.put("Narbonne", new Ville("Narbonne", 53400));
        villes.put("Lyon", new Ville("Lyon", 484000));
        villes.put("Foix", new Ville("Foix", 9700));
        villes.put("Pau", new Ville("Pau", 77200));
        villes.put("Marseille", new Ville("Marseille", 850700));
        villes.put("Tarbes", new Ville("Tarbes", 40600));
        
        Ville villeMoinsPeuplee = null;
        int populationMin = Integer.MAX_VALUE;
        
        for (Ville ville : villes.values()) {
            if (ville.getNombreHabitants() < populationMin) {
                populationMin = ville.getNombreHabitants();
                villeMoinsPeuplee = ville;
            }
        }

        if (villeMoinsPeuplee != null) {
            villes.remove(villeMoinsPeuplee.getNom());
        }

        System.out.println("Villes restantes :");
        for (Ville ville : villes.values()) {
            System.out.println(ville.getNom() + ", Population : " + ville.getNombreHabitants());
        }
	}
}