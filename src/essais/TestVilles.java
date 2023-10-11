package essais;

import java.util.ArrayList;
import java.util.Iterator;

import entities.Ville;

public class TestVilles {

	public static void main(String[] args) {
		ArrayList<Ville> villes = new ArrayList<Ville>();
		villes.add(new Ville("Nice", 343000));
		villes.add(new Ville("Carcassonne", 47800));
		villes.add(new Ville("Narbonne", 53400));
		villes.add(new Ville("Lyon", 484000));
		villes.add(new Ville("Foix", 9700));
		villes.add(new Ville("Pau", 77200));
		villes.add(new Ville("Marseille", 850700));
		villes.add(new Ville("Tarbes", 40600));
		
		Ville villePlusGrandeDemo = null;
		for(Ville v : villes) {
			if(villePlusGrandeDemo == null || v.getNombreHabitants() > villePlusGrandeDemo.getNombreHabitants()) {
				villePlusGrandeDemo = v;
			}
		}
		if(villePlusGrandeDemo != null) {
			System.out.println("La ville avec la plus grande démographie est : " + villePlusGrandeDemo.getNom());
			System.out.println("Le nombre d'habitants est : " + villePlusGrandeDemo.getNombreHabitants());
		} else {
			System.out.println("La liste de villes est vide.");
		}
		
		 Ville villeMoinsPeuplee = villes.get(0);
		 for (Ville ville : villes) {
	            if (ville.getNombreHabitants() < villeMoinsPeuplee.getNombreHabitants()) {
	                villeMoinsPeuplee = ville;
	            }
	        }
		 villes.remove(villeMoinsPeuplee);
		for(Ville vi : villes) {
			if(vi.getNombreHabitants() > 100000) {
				vi.setNom(vi.getNom().toUpperCase());
			}
		}
		 
		 
		System.out.println(villes);
	}
}