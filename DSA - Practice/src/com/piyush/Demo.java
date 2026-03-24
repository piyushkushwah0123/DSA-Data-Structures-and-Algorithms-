package com.piyush;

public class Demo {

	public static void main(String[] args) {

//		int[] arr = { 10, 7, 8, 5, 12, 2 };
//		int sum = 0;
//
//		for (int i = 0; i <= arr.length - 1; i++) {
//			sum = (sum + arr[i])% 7;
//		}
//		if (sum == 0) {
//			System.out.println("divisible");
//		} else {
//			System.out.println("Not");
//		}	

//		int[] arr = { 3,2,4,5,2,8,9,7 };
//		int target = 13;
//		for (int i = 0; i <= arr.length - 1; i++) {
//			for(int j = i+1; j <= arr.length - 1; j++) {
//				if(arr[i]+arr[j]==target){
//					System.out.println(arr[i] + " " + arr[j]);
//				}
//			}
//		}	

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 5) {
				System.out.println(i);
			}
		}
	}
}
