package com.piyush;

import java.util.*;

public class SubArray {
    
    public int largestInteger(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        // Step 1: traverse all subarrays of size k
        for (int i = 0; i <= n - k; i++) {
            Set<Integer> set = new HashSet<>();

            // Step 2: store unique elements of subarray
            for (int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }

            // Step 3: count frequency
            for (int num : set) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        // Step 4: find largest element with freq = 1
        int ans = -1;
        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                ans = Math.max(ans, num);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        SubArray obj = new SubArray();

        int[] nums = {3, 9, 7, 2, 1, 7};
        int k = 3;

        int result = obj.largestInteger(nums, k);
        System.out.println("Answer: " + result);
    }
}