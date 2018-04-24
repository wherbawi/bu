package edu.bu.runners;

import java.util.ArrayList;
import java.util.List;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

import edu.bu.domain.Comparables;
import edu.bu.domain.House;

public class ComparablesTester {
	public static void main(String[] a) {
		List<House> houses = new ArrayList<>();
		houses.add(new House(10));
		houses.add(new House(20));

		List<Car> cars = new ArrayList<>();
		cars.add(new Car(5000));
		cars.add(new Car(440));

		java.util.Collections.sort(cars);
		System.out.println(cars.get(1));

		// java.util.Collections.sort(new ArrayList<String>());
		// Object max = getMax(cars);
		Object max2 = getMax(houses);
		System.out.println(max2);
		// System.out.println(max);
	}

	private static <T extends Comparables<T>> Comparables<T> getMax(List<T> comparables) {
		Comparables<T> max = null;
		for (T comparable : comparables) {
			if (max == null || max.compare(comparable) < 0)
				max = comparable;
		}
		return max;
	}
}
