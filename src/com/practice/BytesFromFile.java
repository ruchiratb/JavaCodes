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

public class BytesFromFile {
	
	public static void main(String[] args) throws IOException {
//		fromFile();
		Path path = Paths.get("E:\\videocoding\\yuv\\stefan.yuv");
		byte[] data = readBytes(path);
//		createImage(data);
	}
	
	private static void fromFile() throws IOException{
		Path path = Paths.get("E:\\videocoding\\yuv\\stefan.yuv");
		byte[] data = Files.readAllBytes(path);
		int bytes_per_frame = 288*352;
		System.out.println("no of bytes = "+data.length);
		System.out.println("no of frames = "+data.length/bytes_per_frame);
//		for (int i = 0; i < data.length; i++) {
//			System.out.print(data[i]+" ");
//		}
		
	}
	
	private static byte[] readBytes(Path path) throws IOException{

		int length = Files.readAllBytes(path).length;
		int bytes_per_frame = (int) (288*352*1.5);
		int total_frames = length/bytes_per_frame;
		      FileInputStream fis = null;
		      int i = 0;
		      char c;
		      byte[] bs = new byte[bytes_per_frame];
		         // create new file input stream
		         fis = new FileInputStream("E:\\7th sem\\my stuff\\Project\\FYP\\video\\stefan_cif.yuv");
		      
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
		        	 if (j<9) {
						createImage(bs, "Image00"+(j+1));						
					}else {
						createImage(bs, "Image0"+(j+1));
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
	
	private static void createImage(byte[] bytes, String name) throws IOException{
		OutputStream out = null;
		String path = "E:\\videocoding\\yuv\\"+name+".jpg";
		try {
	    out = new BufferedOutputStream(new FileOutputStream(path));
	    out.write(bytes);
		} finally {
	    if (out != null) out.close();
		}
	}
	
}
