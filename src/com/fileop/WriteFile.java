package com.fileop;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		 	int length = 64000000 * 2;
	        BufferedWriter output = null;
	        Random rand = new Random();
	        byte temp;
	        try {
	            File file = new File("E:\\Project\\numbers.txt");
	            output = new BufferedWriter(new FileWriter(file));
	            for (int i = 0; i < length; i++) {
	            	temp = (byte) rand.nextInt(2);
	            	if (temp == 1) {
			            output.write("1");								
					}else {
						output.write("0");
					}			
				}
	        } catch ( IOException e ) {
	            e.printStackTrace();
	        } finally {
	            if ( output != null ) output.close();
	        }
	        System.out.println("Done..");
	}

}
