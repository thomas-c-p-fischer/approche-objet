package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws IOException {
		
		Path pathFichierRecensement = Paths.get("C:/Temp/Diginamic/recensement.csv");
		List<String> donneesRecensement = Files.readAllLines(pathFichierRecensement, StandardCharsets.UTF_8);
		List<Ville> villes = new ArrayList<Ville>();
		
		donneesRecensement.get(0);
		donneesRecensement.remove(0);

		for(String donnees : donneesRecensement) {
			String[] tokens = donnees.split(";");
			String popu = tokens[9].replaceAll("\\s", "");
			int pop = Integer.parseInt(popu);
			Ville v = new Ville(tokens[0], tokens[1], tokens[2], tokens[5], tokens[6], pop);
			villes.add(v);
		}
		
		Recensement recensement = new Recensement(villes);
		
		 Scanner scanner = new Scanner(System.in);

	        int choix;
	        do {
	            System.out.println("Menu:");
	            System.out.println("1. Recherche de population d'une ville");
	            System.out.println("2. Recherche des 10 régions les plus peuplées");
	            System.out.println("3. Recherche des 10 départements les plus peuplés");
	            System.out.println("4. Quitter");
	            System.out.print("Choix : ");
	            choix = scanner.nextInt();

	            switch (choix) {
	                case 1:
	                    MenuService recherche = new RecherchePopulationVille();
	                    recherche.traiter(recensement, scanner);
	                    break;
	                case 2:
	                    recherche = new RechercheRegionPlusPeuplee();
	                    recherche.traiter(recensement, scanner);
	                    break;
	                case 3:
	                	recherche = new RechercheDepartementPlusPeuple();
	                    recherche.traiter(recensement, scanner);
	                    break;
	                case 4:
	                    System.out.println("Au revoir !");
	                    break;
	                default:
	                    System.out.println("Choix invalide. Réessayez.");
	                    break;
	            }
	        } while (choix != 4);

	        scanner.close();
	}
}