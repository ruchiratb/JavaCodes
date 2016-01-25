package com.practice;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.IOException;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BitsFromFile {
	
	public static void main(String[] args) throws IOException {
//		fromFile();
		Path path = Paths.get("E:\\videocoding\\yuv\\stefan.yuv");
		byte[] data = readBytesFromSource(path);
		System.out.println("data length ="+data.length);
	}

	private static byte[] readBytesFromSource(Path path) throws IOException{

		int length = Files.readAllBytes(path).length;
		      FileInputStream fis = null;
		      int i = 0;
		      char c;
		      byte[] bs = new byte[length];
		         // create new file input stream
		         fis = new FileInputStream(path.toAbsolutePath().toString());
		      
		      try{
		        	 // read bytes to the buffer
		        	 i=fis.read(bs);
		        	 	        	 
		        	 
		        	 // for each byte in buffer
		        	 for(byte b:bs)
		        	 {
		        		 
		        		 // converts byte to character
		        		 c=(char)b;
		        		 
		        		 // print
//		        		 System.out.print(c);
		        	 }  
//					createImage(bs, "Image"+j);
		      }catch(Exception ex){
		         // if any error occurs
		         ex.printStackTrace();
		      }finally{
		         
		         // releases all system resources from the streams
		         if(fis!=null)
		            fis.close();
		      }
		  return bs;
	}
	
	private static byte[] readBytes(Path path) throws IOException{

		int length = Files.readAllBytes(path).length;
		int bytes_per_frame = 288*352;
		int total_frames = length/bytes_per_frame;
		      FileInputStream fis = null;
		      int i = 0;
		      char c;
		      byte[] bs = new byte[bytes_per_frame];
		         // create new file input stream
		         fis = new FileInputStream("E:\\videocoding\\yuv\\stefan.yuv");
		      
		      try{
		         for (int j = 0; j < total_frames; j++) {
		        	 // read bytes to the buffer
		        	 i=fis.read(bs);
		        	 
		        	 // prints
		        	 System.out.println("\nframe number = "+j);
		        	 System.out.println("Number of bytes read: "+i);
		        	 System.out.print("Bytes read: ");
		        	 
		        	 // for each byte in buffer
		        	 for(byte b:bs)
		        	 {
		        		 
		        		 // converts byte to character
		        		 c=(char)b;
		        		 
		        		 // print
//		        		 System.out.print(c);
		        	 }  
				}
		      }catch(Exception ex){
		         // if any error occurs
		         ex.printStackTrace();
		      }finally{
		         
		         // releases all system resources from the streams
		         if(fis!=null)
		            fis.close();
		      }
		  return bs;
	}

	
}
