package com.fileop;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		
		String text = readFile("E:\\workspace\\FYP\\numbers.txt");
		System.out.println(text);
		int index = 0;
		int bytes = text.length()/8;
		byte value;
		for (int i = 0; i < bytes; i++) {
			value = (byte) Integer.parseInt(text.substring(index, index+8),2);
			System.out.println(value);
			index+=8;
		}
		
			

	}
	
	static String readFile(String fileName) throws IOException {
	    BufferedReader br = new BufferedReader(new FileReader(fileName));
	    try {
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();

	        while (line != null) {
	            sb.append(line);
	            sb.append("\n");
	            line = br.readLine();
	        }
	        return sb.toString();
	    } finally {
	        br.close();
	    }
	}

}
