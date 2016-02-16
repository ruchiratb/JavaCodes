package com.programs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Random;

public class Testing {

	public static void main(String[] args) throws InterruptedException, IOException {
//		int a = 20;
//		String str = Integer.toBinaryString(a);
//		System.out.println(str);
//		int value = Integer.parseInt(str, 2);
//		System.out.println(value);	
		
//		appendToFile();
//		Files.write(Paths.get("C:\\Users\\Ruchira\\Desktop\\testfile.txt"), "the text".getBytes(), StandardOpenOption.APPEND);
		
//		convertToBits(33);
		

	}
	
	private static void appendToFile() throws IOException{
		 BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\Ruchira\\Desktop\\testfile.txt"));
		 out.write("aString1");
		 out.close();
         out = new BufferedWriter(new FileWriter("C:\\Users\\Ruchira\\Desktop\\testfile.txt",true));
         out.write("aString2");
         out.close();
        
       /* BufferedReader in = new BufferedReader(new FileReader("filename"));
        String str;
        while ((str = in.readLine()) != null) {
           System.out.println(str);
        }*/
	}
	
	private static void convertToBits(int n){
		System.out.println(n);
		String s = String.valueOf(n);
		String s2 = String.format("%8s", Integer.toBinaryString(n)).replace(' ', '0');
		System.out.println(s2);
		byte x;
		for (int i = 0; i < s2.length(); i++) {
			if (s2.charAt(i) == '1') {
				x = 1;
				System.out.println(x);
			} else {
				x = 0;
				System.out.println(x);
			}
		}
	}
	
	private static void toBinaryStringDemo(){
		String s = String.format("%8s", Integer.toBinaryString(125)).replace(' ', '0');
		System.out.println(s);
		if (s.length() > 8) {
			s = s.substring(s.length()-8, s.length());
			System.out.println(s);
		}
	}
	

}
