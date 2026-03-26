package com.piyush;

import java.util.*;

public class PascalTriangle {

	public static void main(String[] args) {

		int n = 5;

		List<List<Integer>> l = new ArrayList<>();

		List<Integer> prev = new ArrayList<>();
		prev.add(1);
		l.add(prev);

		for (int i = 1; i < n; i++) {

			List<Integer> curr = new ArrayList<>();

			curr.add(1); 

			for (int j = 1; j < i; j++) {
				int val = prev.get(j - 1) + prev.get(j);
				curr.add(val);
			}
			curr.add(1);
			l.add(curr);
			prev = curr;
		}
		for (List<Integer> row : l) {
			System.out.println(row);
		}
	}
}