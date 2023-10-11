package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetDouble {
	public static void main(String[] args) {
		HashSet<Double> setDouble = new HashSet<Double>();
		setDouble.add(1.5);
		setDouble.add(8.25);
		setDouble.add(-7.32);
		setDouble.add(13.3);
		setDouble.add(-12.45);
		setDouble.add(48.5);
		setDouble.add(0.01);
		System.out.println(setDouble);
		
		double plusGrd = Collections.max(setDouble);
		System.out.println(plusGrd);
		double plusPetit = Collections.min(setDouble);
		setDouble.remove(plusPetit);
		System.out.println(setDouble);
		
    }
}
