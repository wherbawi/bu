package edu.bu.domain;

public class Fish extends Animal {

	public Fish(int x, int y) {
		super(x, y);
	}

	public String toString() {
		return super.toString() + "this is a fish";
	}

}
