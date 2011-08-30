package com.chowaniok.euler;

import org.apache.commons.lang3.time.StopWatch;

public class EU1 {

	public int solve(int number) {
		int result = 0;
		for (int i = 0; i < number; i++) {
			if((i % 3 == 0 ) | (i % 5 == 0)) {
				result += i; 
			}
		}
		return result;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		int result = new EU1().solve(100);
		System.out.println(result);
		System.out.println("time:" + stopWatch.getNanoTime() );
		
	}

}
