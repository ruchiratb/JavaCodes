package com.practice;

import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class ConnectToInternet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		String url = getURL();
		connectURL(url);

	}
	
	private static String getURL(){
		String url = "http://tutorialspoint.com";
		return url;				
	}
	
	private static void connectURL(String url){
		try {
	         InetAddress addr;
	         Socket sock = new Socket("www.javatutorial.com", 80);
	         addr = sock.getInetAddress();
	         System.out.println("Connected to " + addr);
	         sock.close();
	      } catch (java.io.IOException e) {
	         System.out.println("Can't connect to " + url);
	         System.out.println(e);
	      }
	}

}
