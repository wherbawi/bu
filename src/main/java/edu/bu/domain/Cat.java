package edu.bu.domain;

public class Cat extends Animal {

	private Sound sound;

	public Cat() {

	}

	public Cat(int x, int y, Sound sound) {
		super(x, y);
		this.sound = sound;
	}

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



	@Override
	public String toString() {
		return "Cat [sound=" + sound + ", getX()=" + getX() + ", getY()=" + getY() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public Sound getSound() {
		return sound;
	}

	public void setSound(Sound sound) {
		this.sound = sound;
	}

}
