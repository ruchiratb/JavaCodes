package com.practice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ReadBitsFromFile {
	public static void main(String[] args) throws IOException {
		
		InputStream inStream = null;
	    BufferedInputStream bis = null;
		try{
	         // open input stream test.txt for reading purpose.
	         inStream = new FileInputStream("E:\\workspace\\FinalProject\\final_output.txt");
	         
	         // input stream is converted to buffered input stream
	         bis = new BufferedInputStream(inStream);
	         
	         // read number of bytes available
	         int numByte = bis.available();	      
	         StringBuilder bytestr = new StringBuilder();
	         int totalbytes = numByte/8;
	         System.out.println("totalbytes = "+totalbytes);
	         // byte array declared
	         byte[] buf = new byte[8];
	         byte[] data = new byte[4000];
	         
	         for (int i = 0; i < data.length; i++) {
	        	 bytestr.setLength(0);
	        	 // read byte into buf , starts at offset 2, 3 bytes to read
	        	 bis.read(buf, 0, 8);
	        	 
	        	 for (int j = 0; j < 8; j++) {
	        		 bytestr.append((char)buf[j]);
	        	 }
	        	 System.out.print("i = "+i +" bits  "+bytestr);
	        	 byte foo = (byte) Integer.parseInt(bytestr.toString(), 2);
	        	 data[i] = foo;
	        	 System.out.println("   "+foo);				
		     }
	         createImage(data, "testimage");
	         }catch(Exception e){
	            e.printStackTrace();
	         }finally{
	            // releases any system resources associated with the stream
	            if(inStream!=null)
	               inStream.close();
	            if(bis!=null)
	               bis.close();
	      }	
	}
	
	private static void createImage(byte[] bytes, String name) throws IOException{
		OutputStream out = null;
		String path = "E:\\videocoding\\"+name+".jpg";
		try {
			out = new BufferedOutputStream(new FileOutputStream(path));
			out.write(bytes);
		} finally {
			if (out != null) 
				out.close();
		}
	}
}
