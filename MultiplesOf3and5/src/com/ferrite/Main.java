package com.ferrite;

public class Main {

	public static void main(String[] args) {
		System.out.println("Start...");
		System.out.println("Long.MAX_VALUE: " + Long.MAX_VALUE);
		System.out.println("Calculation method.");

		long beginTime = System.nanoTime();
		long limit = 1_000L;

		long sum = (3 * (limit / 3 * (limit / 3 + 1)) - 15 * (limit / 15 * (limit / 15 + 1))
				+ 5 * (limit / 5 * (limit / 5 + 1))) / 2;

		System.out.println(String.format("Time: %.3f [ms]", (System.nanoTime() - beginTime) / 1000.));
		System.out.println("Sum: " + sum);

		System.out.println();
		System.out.println("Iteration method.");

		sum = 0L;
		beginTime = System.nanoTime();

		for (long i = 0L; i < limit; ++i) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}

		System.out.println(String.format("Time: %.3f [ms]", (System.nanoTime() - beginTime) / 1000.));
		System.out.println("Sum: " + sum);

		System.out.println("End.");

	}

}
