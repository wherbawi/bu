package edu.bu.example.nolambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import edu.bu.domain.Car;
import edu.bu.domain.Person;

public class ComparatorInlineInstantiation {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("a", 20), new Person("b", 10));
		List<Car> cars = Arrays.asList(new Car(200), new Car(10));

		Collections.sort(persons, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getAge() - o2.getAge();
			}
		});

		Collections.sort(cars, new Comparator<Car>() {

			@Override
			public int compare(Car o1, Car o2) {
				return o1.getSpeed() - o2.getSpeed();
			}
		});

		for (Car car : cars) {
			System.out.println(car.toString());
		}

		for (Person person : persons) {
			System.out.println(person);
		}
	}

}
