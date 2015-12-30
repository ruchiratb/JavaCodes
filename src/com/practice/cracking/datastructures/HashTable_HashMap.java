package com.practice.cracking.datastructures;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Iterator;


public class HashTable_HashMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		Map<String, Integer> table = new Hashtable<String, Integer>();
		
		map.put("house", 1);
		map.put("bus", 4);
		map.put("dog", 2);
		map.put("school", 7);
		
		table.put("house", 1);
		table.put("bus", 4);
		table.put("dog", 2);
		table.put("school", 7);
		
		Iterator it = map.keySet().iterator();
		
		while (it.hasNext()) {
			String name = (String) it.next();
			System.out.println(name+"  "+map.get(name));
			
		}
		
		System.out.println("-------------------------------");
		it = table.keySet().iterator();
		
		while (it.hasNext()) {
			String name = (String) it.next();
			System.out.println(name+"  "+table.get(name));
			
		}

	}

}
