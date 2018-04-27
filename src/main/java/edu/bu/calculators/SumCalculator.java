package edu.bu.calculators;

import java.util.List;

public class SumCalculator {
	public double sum(List<Double> numbers) {
		double sum = 0;
		for (Double number : numbers) {
			sum += number;
		}
		return sum;
	}
}
