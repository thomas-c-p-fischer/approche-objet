package essais;

import entities.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		Theatre theatre = new Theatre("Le Théâtre", 100); 
        theatre.inscrire(50, 30.0);
        theatre.inscrire(30, 30.0);
        theatre.inscrire(40, 30.0); 
        System.out.println("Total de clients inscrits : " + theatre.getTotalClientsInscrits());
        System.out.println("Recette totale : " + theatre.getRecetteTotale());
	}

}
