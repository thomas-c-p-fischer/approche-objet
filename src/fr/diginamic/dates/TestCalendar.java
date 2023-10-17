package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		Calendar calendrier = Calendar.getInstance();
		calendrier.set(2016, 4, 19, 23, 59, 30);
		Date date = calendrier.getTime();
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		String dateFormatee = formateur.format(date);
		System.out.println(dateFormatee);
		
		SimpleDateFormat formateur1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Calendar calendrier2 = Calendar.getInstance();
		Date date2 = calendrier2.getTime();
		String dateFormatee2 = formateur1.format(date2);
		System.out.println(dateFormatee2);
		
		Locale france = Locale.FRANCE;
		Locale allemagne = Locale.GERMANY;
		Locale chine = Locale.CHINA;
		Locale russie = new Locale("ru", "RU");
		SimpleDateFormat formateurFr = new SimpleDateFormat("EEEE/MMMM/yyyy HH:mm:ss", france);
		SimpleDateFormat formateurGer = new SimpleDateFormat("EEEE/MMMM/yyyy HH:mm:ss", allemagne);
		SimpleDateFormat formateurChi = new SimpleDateFormat("EEEE/MMMM/yyyy HH:mm:ss", chine);
		SimpleDateFormat formateurRu = new SimpleDateFormat("EEEE/MMMM/yyyy HH:mm:ss", russie);
		String dateFr = formateurFr.format(date2);
		String dateGer = formateurGer.format(date2);
		String dateChi = formateurChi.format(date2);
		String dateRu = formateurRu.format(date2);
		System.out.println("France :" + dateFr);
		System.out.println("Allemagne :" + dateGer);
		System.out.println("Chine :" + dateChi);
		System.out.println("Russie :" + dateRu);
		
	}

}
