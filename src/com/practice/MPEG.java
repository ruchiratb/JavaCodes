package com.practice;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MPEG {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 try {
		        Process process ;
		        File file = new File("football.ts");
		        if (file.exists()) {
					System.out.println("file is found");
				}else {
					System.out.println("file not found");
				}
		        ProcessBuilder processBuilder = new ProcessBuilder(file.getAbsolutePath());

		        process=processBuilder.start();
		        Scanner sc=new Scanner(process.getInputStream());
		        process=processBuilder.start();
		        while(sc.hasNext()){
		            System.out.println(sc.nextLine());
		        }

		    } catch (IOException ex) {
		    	
		    	ex.printStackTrace();
		    }

	}

}
