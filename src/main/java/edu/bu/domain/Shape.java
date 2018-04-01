package edu.bu.domain;

public abstract class Shape {
	private String name;

	public abstract double getArea();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
