package com.practice;

import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		System.out.println("%20");
		
		int[] longarray = {1,2,3,4,5,6,7,8,9};
		int[] shortarray = Arrays.copyOfRange(longarray, 5, 9);
		int[] truncarray = Arrays.copyOf(longarray, 3);
		
		for (int i = 0; i < shortarray.length; i++) {
			System.out.print(shortarray[i]+"  ");
		}
		System.out.println();
		for (int i = 0; i < truncarray.length; i++) {
			System.out.print(truncarray[i]+"  ");
		}

	}

}
