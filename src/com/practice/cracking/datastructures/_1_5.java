package com.practice.cracking.datastructures;
import java.lang.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _1_5 {

	public static void main(String[] args) {
		String s = "I like the way you look at me";
		String regex = " ", replace = "%20";
		replaceSpaces(s, regex, replace);
		replaceSpacesPure(s, regex, replace);
		replaceWithRegex(s, regex, replace);
		
	}
	
	private static void replaceSpaces(String text, String regex, String replace){		
		String s;		
		s = text.replaceAll(regex, replace);
		System.out.println(s);
	}
	
	private static void replaceSpacesPure(String text, String regex, String replace){
		for (int i = 0; i < text.length(); i++) {
			char c = ' ';
			if (text.charAt(i) == c) {
				text = text.substring(0, i) + replace + text.substring(i+1);
			}
		}
		System.out.println(text);
	}
	
	private static void replaceWithRegex(String text, String regex, String replace){
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(text);		
		text = m.replaceAll(replace);			
		System.out.println(text);
	}

}
