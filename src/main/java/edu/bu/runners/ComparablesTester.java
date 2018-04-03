package edu.bu.runners;

import java.util.ArrayList;
import java.util.List;

import edu.bu.domain.Comparables;
import edu.bu.domain.House;

public class ComparablesTester {
	public static void main(String[] a) {
		List<Comparables<House>> houses = new ArrayList<>();
		houses.add(new House(10));
		houses.add(new House(20));

		List<Comparables<Car>> cars = new ArrayList<>();
		cars.add(new Car(50));
		cars.add(new Car(440));

		Object max = getMax(cars);

		// Object max2 = getMax(houses);
		// System.out.println(max2);
		System.out.println(max);
	}

	private static Object getMax(List<Comparables<Car>> cars) {
		Comparables max = null;
		for (Comparables comparable : cars) {
			if (max == null || max.compare(comparable) < 0)
				max = comparable;
		}
		return max;
	}
}
