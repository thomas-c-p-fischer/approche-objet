package fr.diginamic.recensement;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Departement {

		public static void dixDepartementsLesPlusPeuples(Recensement recensement) {
	        
	        List<Ville> villes = recensement.getVilles();

	        Map<String, Integer> populationsDepartement = villes.stream()
	                .collect(Collectors.groupingBy(Ville::getCodeDepartement, Collectors.summingInt(Ville::getPopulation)));

	        populationsDepartement = populationsDepartement.entrySet().stream()
	                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
	                .limit(10)
	                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));


	        System.out.println("Les 10 départements les plus peuplés :");
	        for (Map.Entry<String, Integer> entry : populationsDepartement.entrySet()) {
	            System.out.println(entry.getKey() + " : " + entry.getValue() + " habitants");
	        }
	}
}