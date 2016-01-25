package com.audiovideo;

import java.util.BitSet;

/**
 * 
 * @author Ruchira
 *
 */
public class Frame {
	int frameLength;
	BitSet b = new BitSet();
	
	Frame(int length, BitSet b){
		this.frameLength = length;
		this.b = b;
//		System.out.println(frameLength);
//		printBytes();
	}
	
	public BitSet getBytes(){
		return b;
	}
	
	public int getLength(){
		return frameLength;
	}
	
}
