package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.List;

public class Recensement {
	
	private ArrayList<Ville> villes = new ArrayList<>();;
	
	public Recensement(List<Ville> villes) {
		this.villes = (ArrayList<Ville>) villes;
	}

	@Override
	public String toString() {
		return "Recensement [villes=" + villes + "]";
	}

	/**
	 * @return the villes
	 */
	public ArrayList<Ville> getVilles() {
		return villes;
	}

	/**
	 * @param villes the villes to set
	 */
	public void setVilles(ArrayList<Ville> villes) {
		this.villes = villes;
	}
}
