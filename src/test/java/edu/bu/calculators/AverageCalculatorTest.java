package edu.bu.calculators;

import java.util.Arrays;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class AverageCalculatorTest {
	@Test(expected = IllegalArgumentException.class)
	public void testGetAverage_expectIAE() {
		List<Double> numbers = Arrays.asList(12d);
		AverageCalculator averageCalculator = new AverageCalculator();
		averageCalculator.calcAverage(numbers);

	}

	public void testGetAveragePositive() {
		List<Double> numbers = Arrays.asList(10d, 20d, 30d);
		AverageCalculator averageCalculator = new AverageCalculator();
		SumCalculator mockSumCalculator = mock(SumCalculator.class);
		when(mockSumCalculator.sum(anyList())).thenReturn(60d);
		averageCalculator.setSumCalculator(mockSumCalculator);
		double result = averageCalculator.calcAverage(numbers);
		assertEquals("wrong average", 20, result, 0);

	}
}
