package com.javadsa;

import java.util.Arrays;

public class PrefixSum {
	
	public static void main(String[] args) {
		
		int arr[] = {10, 20, 30, 40, 50, 60, 70};

        int psum[] = new int[arr.length];
        // System.out.println(psum);

        System.out.println(Arrays.toString(psum));

        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
            System.out.print(sum + " ");
        }
	}

}
