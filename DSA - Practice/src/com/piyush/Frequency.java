package com.piyush;

import java.util.HashMap;

public class Frequency {
	public static void main(String[] args) {

		int[] arr = { 5, 1, 2, 2, 3, 1 };

//		HashMap<Integer, Integer> map = new HashMap<>();
//
//		for (int i = 0; i < arr.length; i++) {
//			int num = arr[i];
//
//			if (map.containsKey(num)) {
//				int count = map.get(num);
//				count++;
//				map.put(num, count);
//			} else {
//				map.put(num, 1);
//			}
//		}
//		System.out.println(map);

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			int num= arr[i];
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		System.out.println(map);
	}

}
