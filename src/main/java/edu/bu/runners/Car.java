package edu.bu.runners;

import edu.bu.domain.Comparables;

public class Car implements Comparables<Car> {
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
	public int compare(Car o) {

		return speed - o.speed;
	}

}
