package com.chowaniok.euler;

import org.apache.commons.lang3.time.StopWatch;

public class EU2 {
	
	public long solve(){
		long a = 1;
		long b = 2;
		long sum = 0;
		long result = 0;
		
		while (sum < 4000000) {
			sum = a + b;
			a = b;
			b = sum;
			if(sum % 2 == 0) {
				result += sum;
			}
		}
		result += 2; //we need to add 2 as the 2nd fibonacci we don't add at the begining
		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StopWatch timer = new StopWatch();
		timer.start();
		long result = new EU2().solve();
		System.out.println("result: " + result + " time:" + timer.getNanoTime() );
		
	}

}
