package com.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Random;
import java.util.StringTokenizer;

public class CreateFrameFromData {
	
	static final int frameLength = 16;
	static final int totalData = 64;
	
	public static void main(String[] args) throws IOException {
		File file = new File("E:\\workspace\\FYP\\frame.txt");
		ArrayList<Frame> frames = new ArrayList<>();
		FileOutputStream writer = new FileOutputStream(file);
		generateData();
		BitSet bs= new BitSet(frameLength);
		int value, index = 0;
		BufferedReader reader = new BufferedReader(new FileReader(file));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		
		while ((st.hasMoreTokens())) {
	        value = Integer.valueOf(st.nextToken());
	        if (value == 1) {
				bs.set(index);
				index++;
			}else {
				index++;
			}
	        
	        if (index%frameLength == 0 && index > 0) {
	        	BitSet b=(BitSet) bs.clone();
	        	Frame f =new Frame(frameLength, b);
				frames.add(f);			
				
				bs.clear();
				index= 0;
			}
	    }
		
		System.out.println("Number of Frames = "+frames.size());
		for (Frame f : frames) {
			System.out.println("Frame Length = "+f.getLength());
			System.out.println(f.getBytes());
		}
		
	}
	
	 private static void generateData() throws IOException{
			File output = new File("E:\\workspace\\FYP\\frame.txt");
			if (!output.canWrite()) {
				output.setWritable(true);
			}		
			
			try {
				FileWriter filewriter = new FileWriter(output.getAbsolutePath(), true);		
				BufferedWriter bufferedwriter = new BufferedWriter(filewriter);
				
				Random r = new Random();
								
				for (int i = 0; i < totalData; i++) {
					if (r.nextDouble() > 0.5) {
						bufferedwriter.write("1 ");
					}else {
						bufferedwriter.write("0 ");
					}
				}				
								
				bufferedwriter.close();
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}				
		}

}
