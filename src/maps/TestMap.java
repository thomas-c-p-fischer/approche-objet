package maps;

import java.util.HashMap;

public class TestMap {

	public static void main(String[] args) {
		
		System.out.println("----------------exercice 1------------------");
		
		HashMap<String, Integer>mapSalaires = new HashMap<String, Integer>();
		mapSalaires.put("Paul", 1750);
		mapSalaires.put("Hicham", 1750);
		mapSalaires.put("Yu", 1750);
		mapSalaires.put("Ingrid", 1750);
		mapSalaires.put("Chantal", 1750);	
		System.out.println(mapSalaires.size());
		
		System.out.println("----------------exercice 2------------------");
		
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		for(Integer i : mapVilles.keySet()) {
			System.out.println(i);
		}
		for(String s : mapVilles.values()) {
			System.out.println(s);
		}
		System.out.println("Taille de la map : " + mapVilles.size());
		
		System.out.println("----------------exercice 3------------------");
		
		// Création map1
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		
		// Création map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
		
		// Création map3
		HashMap<Integer, String> map3 = new HashMap<Integer, String>(map1);
		map3.putAll(map2);
		
		for(Integer key : map3.keySet()) {
			System.out.println("Clé : " + key + ", Valeur : " + map3.get(key));
		}
	}
}