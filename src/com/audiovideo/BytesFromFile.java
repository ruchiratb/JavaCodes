package com.audiovideo;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

import javax.imageio.ImageIO;


import java.nio.file.Path;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BytesFromFile {
	
	public static void main(String[] args) throws IOException {
//		fromFile();
		Path path = Paths.get("E:\\videocoding\\yuv\\stefan.yuv");
		byte[] data = readBytesFromImage(path);
		System.out.println("Length = "+data.length);
		int framesize = 352*144*3;
		byte[] randomdata = Files.readAllBytes(path);
		byteToSource(randomdata);

	}
	
	private static void fromFile() throws IOException{
		Path path = Paths.get("E:\\7th sem\\my stuff\\Project\\FYP\\video\\stefan_cif.yuv");
		byte[] data = Files.readAllBytes(path);
		int bytes_per_frame = 288*352;
		System.out.println("no of bytes = "+data.length);
		System.out.println("no of frames = "+data.length/bytes_per_frame);
//		for (int i = 0; i < data.length; i++) {
//			System.out.print(data[i]+" ");
//		}
		
	}
	
	private static void byteToSource(byte[] data){
		System.out.println("data length ="+data.length);
		
		DataOutputStream out=null;
//		DataInputStream in=null;
		try {
			out = new DataOutputStream(new FileOutputStream("E:\\videocoding\\yuv\\randomsource.yuv"));
//			in = new DataInputStream(new FileInputStream("data.in"));				
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
				
		for (int i = 0; i < data.length; i++) {
			byte l=data[i];		
			
			try {
				out.write(l);
//				System.out.print(l+" ");
//				byte val=in.readByte();
//				System.out.println(val);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
//			in.close();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Done..");
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
//					createImage(bs, "Image"+j);
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
	
	private static byte[] readBytesFromImage(Path path) throws IOException{

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
	
	public static void rawToJpeg(byte[] bytes, String path) {
	    try {
		    	File outputFile = new File(path);
		    	/*System.out.println(outputFile.exists());
		    	BufferedImage img = new BufferedImage(500, 500, BufferedImage.TYPE_INT_ARGB);
		    	 img = ImageIO.read(new ByteArrayInputStream(bytes));
		        ImageIO.write(img, "png", outputFile);*/
	    	BufferedImage image = ImageIO.read(new ByteArrayInputStream(bytes));
	    	ImageIO.write(image, "jpg", outputFile);
			
	    } catch (IOException e) {
	        // Handle exception
	    }
	}
	
	public static void StreamBuilder(byte[] data) {
		int data_length=data.length;		
		
		DataOutputStream out=null;
//		DataInputStream in=null;
		try {
			out = new DataOutputStream(new FileOutputStream("E:\\workspace\\FYP\\data.in"));
//			in = new DataInputStream(new FileInputStream("data.in"));				
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
				
		for (int i = 0; i < 150000; i++) {
			int l=data[i];		
			
			try {
				out.write(l);
//				System.out.print(l+" ");
//				byte val=in.readByte();
//				System.out.println(val);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
//			in.close();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Done..");
	}
	
	private static void createImage(byte[] bytes, String name) throws IOException{
		OutputStream out = null;
		String path = "E:\\videocoding\\"+name+".jpg";
		try {
	    out = new BufferedOutputStream(new FileOutputStream(path));
	    out.write(bytes);
		} finally {
	    if (out != null) out.close();
		}
	}
	
}
