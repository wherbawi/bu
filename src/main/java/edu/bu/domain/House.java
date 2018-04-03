package edu.bu.domain;

public class House implements Comparables<House> {
	private int area;

	public House(int area) {
		super();
		this.area = area;
	}

	// - if area< other.area, 0 if both equal, + if area>other.area
	@Override
	public int compare(House o) {

		return area - o.area;
	}

	@Override
	public String toString() {
		return "House [area=" + area + "]";
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

}
