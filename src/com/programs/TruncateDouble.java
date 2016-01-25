package com.programs;

public class TruncateDouble {

	public static void main(String[] args) throws Exception {
	    System.out.println(truncate(2.495860283746596, 6));
	}

	public static double truncate(double value, int places) {
	   
	    long factor = (long) Math.pow(10, places);
	    value = value * factor;
	    long tmp = (long) value;
	    return (double) tmp / factor;
	}
}
