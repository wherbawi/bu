package edu.bu.domain;

public class Fish extends Animal {

	public Fish(int x, int y) {
		super(x, y);
	}

	@Override
	public String toString() {
		return "Fish [getX()=" + getX() + ", getY()=" + getY() + "]";
	}

}
