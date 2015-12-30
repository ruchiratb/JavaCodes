package com.practice.designpatterns;

public class MyObject {
	private MyObject(){};
	
	private static MyObject INSTANCE;
	
	public static synchronized MyObject getInstance(){
		if (INSTANCE == null) {
			System.out.println("Instance is null");
			INSTANCE = new MyObject();
			return INSTANCE;
		}else {
			System.out.println("Instance is not null");
			return INSTANCE;			
		}
	}
	
	public void showMessage(){
		System.out.println("My message");
	}
		
}
