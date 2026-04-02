package com.piyush;

import java.util.*;

public class StringFrequency {

	public static void main(String[] args) {
		String str = "RegexSoftware";
		Map<Character, Integer> freq = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			freq.put(ch, freq.getOrDefault(ch, 0) + 1);
		}

		System.out.println(freq);

	}

}
