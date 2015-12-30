package com.practice.cracking.datastructures;

import java.util.ArrayList;
import java.util.Random;

public class _1_7 {

	public static void main(String[] args) {
		ArrayList<Integer> zeroRows = new ArrayList<Integer>();
		ArrayList<Integer> zeroCols = new ArrayList<Integer>();
		int rows = 4, columns = 3, element;
		int[][] numbers = new int[rows][columns];
		Random rand = new Random(100);
		
		// generation of matrix elements
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				element = rand.nextInt(10)+9;
				if (element < 10) {
					numbers[i][j] = 0;
				}else {
					numbers[i][j] = element;
				}
			}
		}
		
		System.out.println("----------------- Before Operation----------------------");
		printArray(numbers);

		// add row numbers and column numbers to arraylists
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {				
				if (numbers[i][j] == 0) {
					zeroRows.add(i);
					zeroCols.add(j);
				}
			}
		}
		
		for (int i = 0; i < zeroRows.size(); i++) {
			int r = zeroRows.get(i);
			for (int j = 0; j < columns; j++) {
				numbers[r][j] = 0;
			}
		}
		for (int i = 0; i < zeroCols.size(); i++) {
			int c = zeroCols.get(i);
			for (int j = 0; j < rows; j++) {
				numbers[j][c] = 0;
			}
		}
		
		System.out.println("----------------- After Operation-----------------------");
		printArray(numbers);
	}
	
	private static void printArray(int[][] array){
		int rows = array.length;
		int cols = array[0].length; 
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(array[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
