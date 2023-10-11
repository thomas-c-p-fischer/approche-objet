package essais;

import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Iterator;

import entities.Pays;

public class TestSetObjet {

	public static void main(String[] args) {
		
		HashSet<Pays> setPays = new HashSet<>();
		
		setPays.add(new Pays("USA", 331900000L, 70248.63));
		setPays.add(new Pays("France", 67750000L, 43658.98));
		setPays.add(new Pays("Allemagne", 83200000L, 51203.55));
		setPays.add(new Pays("UK", 67330000L, 46510.28));
		setPays.add(new Pays("Italie", 59110000L, 35657.50));
		setPays.add(new Pays("Japon", 125700000L, 39312.66));
		setPays.add(new Pays("Chine", 1412000000L, 12556.33));
		setPays.add(new Pays("Russie", 143400000L, 12194.78));
		setPays.add(new Pays("Inde", 1408000000L, 2256.59));
		
		System.out.println(setPays);
		
		Iterator<Pays> iter = setPays.iterator();
		Pays paysPibHabPlus = null;
		double pibHabPlus = 0.0;
		
		while(iter.hasNext()) {
			Pays p = iter.next();
			if(p.getPibHab() > pibHabPlus) {
				pibHabPlus = p.getPibHab();
				paysPibHabPlus = p;
			}
		}
		System.out.println(paysPibHabPlus);
		
		Pays paysPibTotalPlus = null;
		double pibTotalPlus = 0.0;
		iter = setPays.iterator();
		
		while(iter.hasNext()) {
			Pays p1 = iter.next();
			if(p1.getNombreHabitant() * p1.getPibHab() > pibTotalPlus) {
				pibTotalPlus = p1.getNombreHabitant() * p1.getPibHab();
				paysPibTotalPlus = p1;
			}
		}
		
		System.out.println(paysPibTotalPlus);
		
		Pays paysPibTotalMoins = null;
		double pibTotalMoins = 0.0;
		iter = setPays.iterator();
		
		while(iter.hasNext()) {
			Pays p2 = iter.next();
			if(p2.getNombreHabitant() * p2.getPibHab() < pibTotalPlus) {
				pibTotalMoins = p2.getNombreHabitant() * p2.getPibHab();
				paysPibTotalMoins = p2;;
			}
		}
		
		if (paysPibTotalMoins != null) {
		    String nomEnMajuscules = paysPibTotalMoins.getNom().toUpperCase();
		    System.out.println("Le pays avec le PIB total le moins élevé est : " + nomEnMajuscules);
		    System.out.println("Le PIB total est : " + pibTotalMoins);
		}
		
		iter = setPays.iterator();
		while(iter.hasNext()) {
			Pays p3 = iter.next();
			if(p3.equals(paysPibTotalMoins)) {
				iter.remove();
			}
		}
		
		DecimalFormat df = new DecimalFormat("0");
		
		for(Pays p4 : setPays) {
			System.out.println(p4.getNom() + " :");
			System.out.println(p4.getNombreHabitant() + " habitants;");
			System.out.println(df.format(p4.getPibHab() * p4.getNombreHabitant()) + " PIB.");
		}
	}
}
