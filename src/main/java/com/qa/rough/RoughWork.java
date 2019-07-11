package com.qa.rough;

import java.util.HashMap;
import java.util.Set;

public class RoughWork {

	public static void main(String[] args) {

		String str0 = "Hello this is is testing world world world";

		String[] str1 = str0.split(" ");

		int str1_len = str1.length;

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < str1_len; i++) {
			if (map.containsKey(str1[i])) {
				map.put(str1[i], map.get(str1[i]) + 1);
			} else {
				map.put(str1[i], 1);
			}

		}

		Set<String> set = map.keySet();

		for (String a : set) {
			System.out.print(a + " occured-");
			System.out.println(map.get(a));
		}
		
		System.out.println("This program is done");
		
		System.out.println("This program is done again");
		
		System.out.println("This program is done again third times");
		
		System.out.println("This program is done again 4 times");

	}

}
