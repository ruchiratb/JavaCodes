package com.practice.cracking.datastructures;

import java.util.HashSet;
import java.util.Set;

public class _1_3 {

	public static void main(String[] args) {
		removeDuplicateCharacters(null);

	}
	
//	private static void removeDuplicateCharacters(String str){
//		System.out.println(str);
//		Set<Character> chars = new HashSet<>();
//		for (int i = str.length()-1; i >=0 ; i--) {
//			if (chars.contains(str.charAt(i))) {
//				str = str.substring(0,i)+str.substring(i+1);
//			}else {
//				chars.add(str.charAt(i));
//			}
//		}
//		System.out.println(str);
//	}
	
	private static void removeDuplicateCharacters(String str){
		System.out.println(str);  // initial string before duplicate removal
		// Set is a data structure which doesn't hold duplicate values
		Set<Character> chars = new HashSet<>();
		
		if (str == null) {
			return;
		}
		
		for (int i = 0; i <str.length() ; i++) {
			if (chars.contains(str.charAt(i))) {
				str = str.substring(0,i)+str.substring(i+1);
				i--;
			}else {
				chars.add(str.charAt(i));
			}
		}
		System.out.println(str);
	}

}
