package com.piyush;

import java.util.*;

public class Anagram {

	public static void main(String[] args) {

		String s = "anagram";
		String t = "nagaram";

		if (isAnagram(s, t)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

	public static boolean isAnagram(String s, String t) {

		s = s.replace(" ", "");
		t = t.replace(" ", "");

		s = s.toLowerCase();
		t = t.toLowerCase();

		char[] ar1 = s.toCharArray();
		char[] ar2 = t.toCharArray();

		Arrays.sort(ar1);
		Arrays.sort(ar2);

		return Arrays.equals(ar1, ar2);
	}
}


//package com.piyush;
//
//public class Anagram {
//
//	public static void main(String[] args) {
//
//		String s = "anagram";
//		String t = "nagaram";
//
//		if (isAnagram(s, t)) {
//			System.out.println("True");
//		} else {
//			System.out.println("False");
//		}
//	}
//
//	public static boolean isAnagram(String s, String t) {
//
//		if (s.length() != t.length()) return false;
//
//		char[] ar1 = s.toCharArray();
//		char[] ar2 = t.toCharArray();
//
//		// manual sort
//		sort(ar1);
//		sort(ar2);
//
//		// manual compare
//		for (int i = 0; i < ar1.length; i++) {
//			if (ar1[i] != ar2[i]) {
//				return false;
//			}
//		}
//
//		return true;
//	}
//
//	// Insertion Sort
//	public static void sort(char[] arr) {
//
//		for (int i = 1; i < arr.length; i++) {
//			char key = arr[i];
//			int j = i - 1;
//
//			while (j >= 0 && arr[j] > key) {
//				arr[j + 1] = arr[j];
//				j--;
//			}
//
//			arr[j + 1] = key;
//		}
//	}
//}