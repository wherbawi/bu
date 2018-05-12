package edu.bu.example.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import edu.bu.domain.Car;
import edu.bu.domain.Person;

public class ComparatorWithLambdaAndStream {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("a", 20), new Person("b", 10));
		List<Car> cars = Arrays.asList(new Car(200), new Car(10));
		persons.stream().sorted((o1, o2) -> o1.getAge() - o2.getAge()).forEach(o -> System.out.println(o));
		cars.stream().sorted((o1, o2) -> o1.getSpeed() - o2.getSpeed()).forEach(o -> System.out.println(o));
	}
}
