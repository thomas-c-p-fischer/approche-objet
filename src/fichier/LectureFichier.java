package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		
		ArrayList<Ville> listeVilles = new ArrayList<Ville>();
		Path pathFichierRecensement = Paths.get("C:/Temp/Diginamic/recensement.csv");
		List<String> donneesRecensement = Files.readAllLines(pathFichierRecensement, StandardCharsets.UTF_8);
		Path pathNouveauFichier = Paths.get("C:/Temp/Diginamic/test/recensement.csv");
		
		for(String donnees : donneesRecensement) {
			String[] tokens = donnees.split(";");
			Ville v = new Ville(tokens[6], tokens[2], tokens[1], tokens[9]);
			listeVilles.add(v);
		}
		System.out.println(listeVilles);
		
		ArrayList<Ville> listeVillesPopulationMax = new ArrayList<Ville>();
		Ville entete = listeVilles.get(0);
		entete = listeVilles.remove(0);
		listeVillesPopulationMax.add(entete);
		
		for(Ville ville : listeVilles) {
			String pop = ville.getPopulationTotale().replaceAll("\\s", "");
			int populationTotale = Integer.parseInt(pop);
			if(populationTotale > 24_999) {
				listeVillesPopulationMax.add(ville);
			}
		}
		
		List<String> listeVillesPopulationMaxAsStrings = new ArrayList<>();
		for (Ville ville : listeVillesPopulationMax) {
		    listeVillesPopulationMaxAsStrings.add(ville.toString());
		}
		Files.write(pathNouveauFichier, listeVillesPopulationMaxAsStrings, StandardCharsets.UTF_8);
	}
}