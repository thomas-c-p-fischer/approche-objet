package fr.diginamic.recensement;

import java.util.Scanner;

public class RechercheRegionPlusPeuplee extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        Region.dixRegionsLesPlusPeuplees(recensement);
    }
}
