package fr.diginamic.recensement;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Region {
	public static void dixRegionsLesPlusPeuplees(Recensement recensement) {
        
        List<Ville> villes = recensement.getVilles();

        Map<String, Integer> populationsRegion = villes.stream()
                .collect(Collectors.groupingBy(Ville::getNomRegion, Collectors.summingInt(Ville::getPopulation)));

        populationsRegion = populationsRegion.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(10)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println("Les 10 régions les plus peuplées :");
        for (Map.Entry<String, Integer> entry : populationsRegion.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + " habitants");
        }
    }
}
