package edu.bu.runners;

import java.util.ArrayList;

import edu.bu.domain.Animal;
import edu.bu.domain.Cat;
import edu.bu.domain.Fish;

public class AnimalsRunner {

	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<>();
		animals.add(new Cat(10, 10));
		animals.add(new Fish(10, 10));
		for (Animal animal : animals) {
			System.out.println(animal);
		}

		for (int i = 0; i < animals.size(); i++) {
			System.out.println(animals.get(i));

		}

	}

}
