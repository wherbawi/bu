package edu.bu.structures;

import java.util.ArrayList;

import edu.bu.domain.Animal;

public class Stack {
	ArrayList<Animal> elements;

	public Stack() {
		elements = new ArrayList<>();
	}

	public void push(Animal animal) {
		elements.add(animal);
	}

	public Animal pop() {
		if (isEmpty())
			return null;
		return elements.remove(elements.size() - 1);

	}

	public boolean isEmpty() {
		return elements.size() == 0;
	}
}
