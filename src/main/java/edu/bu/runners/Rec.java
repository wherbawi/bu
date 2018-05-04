package edu.bu.runners;

public class Rec {

	public static void main(String[] args) {
		System.out.println(fact(5));
		System.out.println(sum(5));
	}

	static int fact(int i) {
		if (i == 1)
			return 1;
		return i * fact(i - 1);
	}

	static int sum(int i) {
		if (i == 0)
			return 0;
		return  i*i + sum(i - 1);
	}

	static int fib(int i) {
		if (i == 1 || i == 0)
			return 1;
		return fib(i - 1) + fib(i - 2);

	}

}
