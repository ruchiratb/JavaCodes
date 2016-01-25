package com.practice;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.Random;
import java.io.File;

public class ImageFromBytes {

	public static void main(String[] args) throws IOException {
		Random rand = new Random();
/*		byte[] randombytes = new byte[86000];
		for (int i = 0; i < randombytes.length; i++) {
			randombytes[i] = (byte) rand.nextInt(100);
		}
		randombytes[0] = -1 ;
		randombytes[1] = -40;
		randombytes[2] = -1 ;
		randombytes[3] = -32; 
		randombytes[4] = 0;
		randombytes[5] = 16;
		randombytes[6] = 74;
		randombytes[7] = 70;
		randombytes[8] = 73;
		randombytes[9] = 70;
		randombytes[10] = 0;
		randombytes[11] = 1; randombytes[12] =  2;randombytes[13] =  1;randombytes[14] =  0;randombytes[15] =  72; 
		randombytes[16] = 0;randombytes[17] =  72;randombytes[18] =  0;randombytes[19] =  0;
		createImage(randombytes);*/
		
		byte[] bytes = getBytes();
//		for (int i = 1000; i < 11000; i++) {
//			bytes[i] += rand.nextGaussian();
//		}
		System.out.println("\n"+bytes.length);
//		bytes[1000] = 0;
//		bytes[10000] = 1;
//		bytes[100000] = 1;
		createImage(bytes);
	}
	
	private static byte[] getBytes() throws IOException{

//		File fi = new File("D:\\Images\\Wall papers\\Cultural\\06.jpg");
		File fi = new File("C:\\Users\\Ruchira\\Documents\\MATLAB\\Image5.jpg");
		byte[] fileContent = Files.readAllBytes(fi.toPath());
		return fileContent;
	}
	
	private static void createImage(byte[] bytes) throws IOException{
		OutputStream out = null;
		String path = "image3.png";
		try {
	    out = new BufferedOutputStream(new FileOutputStream(path));
	    out.write(bytes);
		} finally {
	    if (out != null) out.close();
		}
	}

}
