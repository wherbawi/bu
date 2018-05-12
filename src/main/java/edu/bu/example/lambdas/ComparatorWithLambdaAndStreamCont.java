package edu.bu.example.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import edu.bu.domain.Car;
import edu.bu.domain.Person;

public class ComparatorWithLambdaAndStreamCont {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("a", 20), new Person("b", 10), new Person("c", 15));
		Consumer action = System.out::println;
		action.accept("hello");
		persons.stream().filter(p -> p.getAge() > 10).sorted((o1, o2) -> o1.getAge() - o2.getAge())
				.forEach(action);
	}

}
