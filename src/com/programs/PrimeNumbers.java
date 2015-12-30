package com.programs;

public class PrimeNumbers {

	public static void main(String[] args) {
		int n = 100;  
		printPrimeNumbers(n);
		
	}
	
	private static void printPrimeNumbers(int n){
		int divisors = 0;   
		
		for (int i = 1; i < n+1; i++) {
			divisors = 0; // reset the divisors for each number
			
			// number it self is the maximum divisor for a number.
			// therefore loop until 'i' is enough
			for (int j = 1; j < i+1; j++) {
				if (i % j == 0) {
					divisors++;
				} else {
					continue;
				}
				
				// if a number has more than two factors, it is not a prime number
				if (divisors > 2) {
					break;
				}
			}
			
			if (divisors == 2) {
				System.out.print(i+" ");
			}
		}
	}

}
