package edu.bu.example.nolambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import edu.bu.domain.Person;

public class ComparatorSeperateClasTest {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("a", 20), new Person("b", 10));
		Collections.sort(persons, new PersonComparator());
		for (Person person : persons) {
			System.out.println(person.toString());
		}
	}

}
