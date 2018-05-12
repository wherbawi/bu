package edu.bu.example.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import com.sun.corba.se.spi.orbutil.fsm.Action;

import edu.bu.domain.Car;
import edu.bu.domain.Person;

public class ComparatorWithLambda {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("a", 20), new Person("b", 10));
		Collections.sort(persons, (o1, o2) -> o1.getAge() - o2.getAge());

		// Collections.sort(persons, (o1, o2) -> o1.getAge() - o2.getAge());
		for (Person person : persons) {
			System.out.println(person);
		}
	}

}
