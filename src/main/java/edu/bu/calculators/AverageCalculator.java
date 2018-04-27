package edu.bu.calculators;

import java.util.List;

public class AverageCalculator {
	private SumCalculator sumCalculator;

	public double calcAverage(List<Double> numbers) {
		if (numbers.isEmpty())
			throw new IllegalArgumentException("numbers are empty");
		return sumCalculator.sum(numbers) / numbers.size();
	}

	public SumCalculator getSumCalculator() {
		return sumCalculator;
	}

	public void setSumCalculator(SumCalculator sumCalculator) {
		this.sumCalculator = sumCalculator;
	}
}
