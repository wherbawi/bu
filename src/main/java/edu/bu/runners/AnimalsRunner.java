package edu.bu.runners;

import java.util.Iterator;

import edu.bu.domain.Animal;
import edu.bu.domain.Cat;
import edu.bu.domain.Fish;
import edu.bu.domain.Person;

public class AnimalsRunner {

	public static void main(String[] args) {
		Animal cat = new Cat(0, 0);
		Animal fish1 = new Fish(0, 0);
		Animal animal1 = new Animal(0, 0);
		Animal[] animals = new Animal[2];
		animals[0] = new Cat(0, 0);
		animals[1] = new Fish(0, 0);

		for (Animal animal : animals) {
			animal.moveRight();
			if (animal instanceof Cat)
				((Cat) animal).attack();
			System.out.println(animal);

		}

		Person p = new Person("MrX");
		Person p1 = new Person("MrX");
		
		if(p.equals(p1))
			System.out.println("they are equal");

	}

}
