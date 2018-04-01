package edu.bu.runners;

import edu.bu.domain.Comparables;

public class Car implements Comparables {
	private int speed;

	public Car(int speed) {
		super();
		this.setSpeed(speed);
	}

	@Override
	public String toString() {
		return "Car [speed=" + getSpeed() + "]";
	}

	@Override
	public int compare(Object o) {
		return speed - ((Car) o).getSpeed();
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
