package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationVille extends MenuService {
	
	 @Override
	    public void traiter(Recensement recensement, Scanner scanner) {
	        System.out.print("Saisissez le nom de la ville : ");
	        String nomVille = scanner.next();

	        Ville villeRecherchee = recensement.getVilles().stream()
	                .filter(ville -> ville.getNomCommune().equalsIgnoreCase(nomVille))
	                .findFirst()
	                .orElse(null);

	        if (villeRecherchee != null) {
	            System.out.println("La population de " + nomVille + " est de " + villeRecherchee.getPopulation() + " habitants.");
	        } else {
	            System.out.println("Ville non trouvée.");
	        }
	    }
}
