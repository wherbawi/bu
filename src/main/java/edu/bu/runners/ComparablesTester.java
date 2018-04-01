package edu.bu.runners;

import java.util.ArrayList;
import java.util.List;

import edu.bu.domain.Comparables;
import edu.bu.domain.House;

public class ComparablesTester {
	public static void main(String[] a) {
		List<Comparables> houses = new ArrayList<>();
		houses.add(new House(10));
		houses.add(new House(20));

		List<Comparables> cars = new ArrayList<>();
		cars.add(new Car(50));
		cars.add(new Car(440));
		cars.add(new House(2222));

		Object max = getMax(cars);

		Object max2 = getMax(houses);
		System.out.println(max2);
		System.out.println(max);
	}

	private static Object getMax(List<Comparables> coms) {
		Comparables max = null;
		for (Comparables comparable : coms) {
			if (max == null || max.compare(comparable) < 0)
				max = comparable;
		}
		return max;
	}
}
