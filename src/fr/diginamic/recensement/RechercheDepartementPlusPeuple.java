package fr.diginamic.recensement;

import java.util.Scanner;

public class RechercheDepartementPlusPeuple extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        Departement.dixDepartementsLesPlusPeuples(recensement);
    }

}
