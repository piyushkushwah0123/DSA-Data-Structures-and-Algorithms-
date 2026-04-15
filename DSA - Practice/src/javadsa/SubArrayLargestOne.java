package com.javadsa;

import java.util.Arrays;
import java.util.HashMap;

public class SubArrayLargestOne {

	public static void main(String[] args) {

//        int arr[] = {10,1,2,3,4,10,1,2,3,4,10,1,2,3,4};
//
//        HashMap<Integer, Integer> hm = new HashMap<>();
//
//        System.out.println(Arrays.toString(arr));
//
//        for (int i = 0; i < arr.length; i++) {
//
//            int x = arr[i];
//
//            if (hm.containsKey(x)) {
//                int start = hm.get(x);
//                int end = i;
//                for (int j = start; j <= end; j++) {
//                    System.out.print(arr[j] + " ");
//                }
//            }
//            hm.put(x, i);
//        }
//
//        System.out.println(hm);

		int arr[] = { 10, 1, 2, 3, 4, 10, 1, 2, 3, 4, 10, 1, 2, 3, 4 };
		HashMap<Integer, Integer> hm = new HashMap<>();
		int i =1;
		int mark1=0;
		int mark2=0;
		int maxLength=0;
		for(int x:arr) {
			if(hm.containsKey(x) && ((i-hm.get(x))>maxLength)){  // x : 10
				maxLength = i-hm.get(x);
				mark1=hm.get(x);
				mark2=i;			
			}
			else {
				hm.put(x, i);				
			}
			i++;
		}	
		mark1--;
		mark2--;
		for(int j=mark1;j<=mark2;j++) {
			System.out.println(arr[j]+" ");
		}

	}
}