// BUILT IN METHODS:-
package com.piyush;

import java.util.*;

public class GroupAnagram {

    public static void main(String[] args) {

        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> result = groupAnagrams(strs);

        System.out.println(result);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            char[] arr = str.toCharArray();
            Arrays.sort(arr);

            String key = new String(arr);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}





// WITHOUT BUILT IN METHODS:-

//package com.piyush;
//
//import java.util.*;
//
//public class GroupAnagram {
//    public static void main(String[] args) {
//
//        String[] strs = {"eat","tea","tan","ate","nat","bat"};
//
//        List<List<String>> result = groupAnagrams(strs);
//
//        System.out.println(result);
//    }
//
//    public static List<List<String>> groupAnagrams(String[] strs) {
//
//        Map<String, List<String>> map = new HashMap<>();
//
//        for (String str : strs) {
//
//            int[] freq = new int[26];
//
//            for (int i = 0; i < str.length(); i++) {
//                freq[str.charAt(i) - 'a']++;
//            }
//            
//            String key = "";
//            for (int i = 0; i < 26; i++) {
//                key += freq[i] + "#";
//            }
//
//            
//            if (!map.containsKey(key)) {
//                map.put(key, new ArrayList<>());
//            }
//
//            map.get(key).add(str);
//        }
//
//        return new ArrayList<>(map.values());
//    }
//}