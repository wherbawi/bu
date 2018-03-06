package edu.bu.domain;

public class Animal {
	private int x;
	private int y;

	public Animal(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}


	public void moveRight() {
		x = x + 5;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Animal [x=" + x + ", y=" + y + "]";
	}

}
