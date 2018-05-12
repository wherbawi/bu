package edu.bu.example.nolambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import edu.bu.domain.Car;
import edu.bu.domain.Cat;
import edu.bu.domain.Person;

public class ComparatorInnerClassApproach {

	public static void main(String[] a) {
		List<Person> persons = Arrays.asList(new Person("a", 20), new Person("b", 10));
		List<Car> cars = Arrays.asList(new Car(200), new Car(10));
		
		Collections.sort(persons, new PersonComparator());
		Collections.sort(cars, new CarComparator());

		for (Person person : persons) {
			System.out.println(person.toString());
		}

		for (Car car : cars) {
			System.out.println(car.toString());
		}
	}

	static class PersonComparator implements Comparator<Person> {
		public int compare(Person o1, Person o2) {
			return o1.getAge() - o2.getAge();
		}

	}

	static class CarComparator implements Comparator<Car> {
		public int compare(Car o1, Car o2) {
			return o1.getSpeed() - o2.getSpeed();
		}

	}

}
