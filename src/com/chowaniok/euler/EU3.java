package com.chowaniok.euler;

import org.apache.commons.lang3.time.StopWatch;

public class EU3 {

	public long solve(long x) {
		long a = 2;
		while (x > 1) {
			if ((x % a) == 0) {
				x = x / a;
			} else {
				a++;
			}
		}
		return a;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		StopWatch timer = new StopWatch();
		timer.start();
		long result  = new EU3().solve(600851475143L);
		System.out.println("result: " + result + " time: "	+ timer.getNanoTime());
	}

}
