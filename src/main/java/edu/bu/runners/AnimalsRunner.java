package edu.bu.runners;

import edu.bu.domain.Cat;
import edu.bu.domain.Fish;

public class AnimalsRunner {

	public static void main(String[] args) {
		Cat cat = new Cat(0, 0);
		System.out.println(cat.getX() + "," + cat.getY());
		cat.moveRight();
		System.out.println(cat.getX() + "," + cat.getY());
		System.out.println(cat.toString());
		Fish f = new Fish(20, 20);
		System.out.println(f.toString());

	}

}
