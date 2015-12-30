package com.practice.cracking.datastructures;

import java.util.HashSet;
import java.util.Set;

public class _1_1 {

	public static void main(String[] args) {
		boolean state;
//		state = hasUniqueChars("kdynfrw");
		state = isUniqueChars2("chess");
		System.out.println(state);

	}
	
	private static boolean hasUniqueChars(String str){
		Set<Character> chars = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			chars.add(str.charAt(i));
		}
		if (str.length() == chars.size()) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isUniqueChars2(String str) {
		    boolean[] char_set = new boolean[256];
		    for (int i = 0; i < str.length(); i++) {
		    int val = str.charAt(i);
		    if (char_set[val]) return false;
		    char_set[val] = true;
	    }
		    return true;
		}

}
