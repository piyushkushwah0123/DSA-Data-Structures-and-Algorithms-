package com.javadsa;

import java.util.HashMap;

public class FrequencyOfString {

    public static void main(String[] args) {
        
        String s = "Prasoon Bidua";

        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        for (char x : s.toCharArray()) {
        //	System.out.println(i);
            String i = Character.toString(x);
        // If element if already present in the HashMap

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