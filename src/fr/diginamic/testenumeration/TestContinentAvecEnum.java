package fr.diginamic.testenumeration;

import java.util.ArrayList;
import java.util.List;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		List<Ville> villes = new ArrayList<Ville>();
		villes.add(new Ville("New York", 50000, Continents.AMERIQUE));
		villes.add(new Ville("Paris", 55050, Continents.EUROPE));
		villes.add(new Ville("Pékin", 506690, Continents.ASIE));
		villes.add(new Ville("Moscou", 987000, Continents.EUROPE));
		villes.add(new Ville("Berlin", 651340, Continents.EUROPE));
		villes.add(new Ville("Sydney", 900200, Continents.OCEANIE));
		villes.add(new Ville("Sao Paulo", 780514, Continents.AMERIQUE));
		villes.add(new Ville("Dakar", 556470, Continents.AFRIQUE));
		
		for(Ville v : villes) {
			System.out.println(v.getContinent());
		}

	}

}
