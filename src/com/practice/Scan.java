package com.practice;

import java.util.Scanner;

public class Scan {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("input a:");
		String a = scan.nextLine();
		
		if (a.equals("write")) {
			System.out.println("write");
		}else if(a.equals("left")){
			System.out.println("left");
		}else {
			System.out.println("ffffffffffffff");
		}
	}
	
}
