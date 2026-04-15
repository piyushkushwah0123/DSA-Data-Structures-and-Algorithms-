package com.javadsa;

import java.util.HashMap;

public class Occurance {
	
	public static void main(String[] args) {
		
		 HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>(); // hm{}

	        int arr[] = {10, 10, 20, 10, 10, 20, 20, 30, 30, 40, 50, 40, 60, 60};

	        for (int i : arr) {
	            if (hm.containsKey(i)) {
	                int count = hm.get(i);
	                count++;
	                hm.put(i, count);
	            } else {
	                hm.put(i, 1);
	            }
	        }

	        System.out.println(hm);
	}

}
