package com.practice;

public class ByteArrays {

	public static void main(String[] args) {
		getByteXOR();
		
		//System.out.println((char)27 + "[31mThis text would show up red" + (char)27 + "[0m");
		byte register = 76;
		byte shifted = (byte) (register<<1);
//		System.out.println(shifted & 0xff);
//		System.out.println(Integer.toBinaryString(0x69DE135));
//		System.out.println(Integer.toBinaryString(shifted));
		
//		System.out.println(Integer.toBinaryString(register));
//		System.out.println(String.format("%8s", Integer.toBinaryString(register)).replace(' ', '0'));
//		register = shiftAndAdd(register);
//		System.out.println(Integer.toBinaryString(register & 0xff));
//		int k = register & 0xff;
//		System.out.println(k);

	}
	
	private static byte shiftAndAdd(byte reg){
		byte temp = (byte) (reg<<1);
		temp = (byte) (temp+1);
		return temp;
	}
	
	private static boolean getMSB(byte reg){
		int value = reg & 0xff;
		
		if (value >= 128) {
			return true;
		} else {
			return false;
		}
	}
	
	private static void getByteXOR(){
		byte a = 95, b = 78;
		byte c = (byte) (a ^ b);
		System.out.println(c);
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(c));
	}

}
