package edu.bu.domain;

public class Cat extends Animal {

	public Cat(int x, int y) {
		super(x, y);
	}

	@Override
	public void moveRight() {
		setX(getX() + 10);

	}

	public void attack() {
		setY(getY() + 15);
	}

	public String toString() {
		return "this is a cat at pos" + getX() + "," + getY();
	}

}
