package com.programs;

import java.util.ArrayList;

public class Program1 {

	public static void main(String[] args) {
		int n = 100;  
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes = getPrimeNumbers(n);
		printNumberPattern(primes);
	}
	
	private static ArrayList<Integer> getPrimeNumbers(int n){
		ArrayList<Integer> numbers = new ArrayList<Integer>();
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
				numbers.add(i);
			}
		}
		return numbers;
	}
	
	private static void printNumberPattern(ArrayList<Integer> numbers){
		int lower, higher, difference;
		for (int i = 0; i < numbers.size()-1; i++) {
			lower = numbers.get(i);
			higher = numbers.get(i+1);
			difference = higher - lower;
			
			if (difference == 2) {
				System.out.print((lower+1)+" ");
			}
		}
	}

}
