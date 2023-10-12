package fichier;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) throws IOException {
		
		Path pathFichierRecensement = Paths.get("C:/Temp/Diginamic/recensement.csv");
		Path pathFichierRecensement100 = Paths.get("C:/Temp/Diginamic/test/recensement.csv");
		List<String> lignes = Files.readAllLines(pathFichierRecensement, StandardCharsets.UTF_8);
        List<String> premieresLignes = lignes.subList(0, Math.min(100, lignes.size()));
		
        Files.write(pathFichierRecensement100, premieresLignes);
		
	}
}