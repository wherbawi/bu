package edu.bu.calculators;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SumCalculatorTest {
	@Test
	public void testSum() {
		List<Double> numbers = Arrays.asList(10d, 20d, 30d);
		SumCalculator cut = new SumCalculator();
		double result = cut.sum(numbers);
		assertEquals("wrong sum", 61, result, 0);
	}
}
