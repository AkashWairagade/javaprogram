package com.basics.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NonOrRepeatingFirstChar {


    public static void main(String[] args) {
        String input = "arrccddf";
        System.out.println(findFirstNonRepeatingCharcter(input));
        System.out.println(findFirstRepeatingCharcter(input));
    }

    public static Character findFirstNonRepeatingCharcter (String input) {
        //String input = "aaarrcddf"
        // output --> c

        char[] inputStringArray = input.toCharArray();
        Map<Character, Integer> freq = new HashMap<>();
        //calculating character count
        for (char c : inputStringArray) {
            freq.put(c,freq.getOrDefault(c,0)+1);
        }

        for (char c: inputStringArray) {
            if (freq.get(c)==1) {
                return c;
            }

        }


       return null;

    }


    public static char findFirstRepeatingCharcter (String input) {
        char[] inputStringArray = input.toCharArray();
        Set<Character> freq = new HashSet<>();
        for(char c : inputStringArray) {
             if (!freq.add(c)){
                 return c;
             }

        }

        return  Character.MIN_VALUE;

    }


}
