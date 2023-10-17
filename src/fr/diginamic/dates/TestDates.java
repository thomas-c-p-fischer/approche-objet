package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		Date dateDuJour = new Date();
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		String chaine1 = formateur.format(dateDuJour);
		System.out.println(chaine1);
		
		Date datePassee = new Date(116, 4, 17, 23, 59 ,30);
		SimpleDateFormat formateur1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String chaine2 = formateur1.format(datePassee);
		System.out.println(chaine2);
		
		chaine1 = formateur1.format(dateDuJour);
		System.out.println(chaine1);
		

	}

}
