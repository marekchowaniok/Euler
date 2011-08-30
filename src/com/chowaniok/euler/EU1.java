package com.chowaniok.euler;

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
		int result = new EU1().solve(1000);
		System.out.println(result);
	}

}
