package edu.bu.runners;

import edu.bu.domain.Animal;
import edu.bu.structures.Stack;

public class StackTester {

	public static void main(String[] args) {
		Stack stack = new Stack();
		System.out.println(stack.pop());
		Animal animal = new Animal(10, 10);
		stack.push(animal);
		Animal animal2 = new Animal(20, 20);
		stack.push(animal2);
		stack.push(new Animal(30, 30));

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		

	}

}
