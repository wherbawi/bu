package edu.bu.runners;

import java.io.IOException;
import java.util.Scanner;

public class Calaculator {
	public static void main(String[] args) {
		int a = 10000;
		int b = 0;
		int result = 0;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("enter  a, b");
			a = scanner.nextInt();
			b = scanner.nextInt();
			try {
				result = divide(a, b);
				System.out.println(result);

			} catch (IllegalArgumentException e) {
				System.out.println("Please try again" + e.getMessage());
			} catch (Exception e) {
				System.out.println("This is catch block 2" + e.getMessage());
			} finally {
				System.out.println("this is the finally block");
			}

			try {
				divide(1, 2);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// System.out.println(result);

	}

	private static int divide(int a, int b) throws IOException {
		if (b == 0)
			throw new IllegalArgumentException("B cannot be 0");
		if (a > 1000)
			throw new ArithmeticException("a cannot be >1000");
		int result = a / b;
		return result;
	}
}
