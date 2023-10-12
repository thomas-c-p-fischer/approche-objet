package tri;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {

	@Override
	public int compare(Ville ville1, Ville ville2) {
		return -ville1.getNombreHabitants().compareTo(ville2.getNombreHabitants());
	}
}