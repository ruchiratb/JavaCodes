package com.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

public class HashMapSearchByValue {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		
		int value = 3;
		
		//one to one case: only one key has the given value
		String key = getKeyOneToOne(map, value);
		System.out.println("key of value: "+value);
		System.out.println(key);
		
		//many to one case: many keys can have the given value
		map.put("e", 3);
		map.put("f", 4);
		map.put("g", 3);
		map.put("h", 3);
		Set<String> keys = new HashSet<>();
		keys = getKeyManyToOne(map, value);
		
		Iterator it = keys.iterator();
		System.out.println("\nkeys of value: "+value);
		while (it.hasNext()) {
			System.out.print(it.next()+" ");
		}

	}
	
	//if the key-value has one-to-one mapping we can return the first matching case
	private static String getKeyOneToOne(HashMap<String, Integer> map, int value){
		String key = null;
		for (Entry entry: map.entrySet()) {
			if (Objects.equals(value, entry.getValue())) {
				key = (String) entry.getKey();
				return key;
			}
		}
		
		return key;
	}
	
	//if the key-values are in many-to-one relation we need to use a set
	//among the matching keys we can filter the required keys if necessery
	private static Set<String> getKeyManyToOne(HashMap<String, Integer> map, int value){
		String key = null;
		Set<String> keyset = new HashSet<>();
		
		for (Entry entry: map.entrySet()) {
			if (Objects.equals(value, entry.getValue())) {
				keyset.add((String) entry.getKey());				
			}
		}
		
		return keyset;
	}

}
