package com.piyush;

import java.util.*;

public class SortStringSelection {

	public static void main(String[] args) {

		char[] arr = { 'a', 'b', 'c', 'd', 'j', 'a', 'b' };

		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}

			char temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}

		System.out.println(Arrays.toString(arr));

	}

}
