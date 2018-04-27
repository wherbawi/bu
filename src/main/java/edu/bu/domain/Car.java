package edu.bu.domain;

public class Car implements Comparable<Car> {
	private int speed;

	public Car(int speed) {
		super();
		this.setSpeed(speed);
	}

	@Override
	public String toString() {
		return "Car [speed=" + getSpeed() + "]";
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public int compareTo(Car o) {

		return speed - o.speed;
	}

}
