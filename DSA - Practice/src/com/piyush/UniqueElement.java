package com.piyush;

import java.util.HashSet;
import java.util.Set;

public class UniqueElement {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 1, 3, 2, 5 };

		Set<Integer> set = new HashSet<>();

		for (int i : arr) {
			set.add(i);

		}
		System.out.println(set.size());
		System.out.println(set);
	}
}