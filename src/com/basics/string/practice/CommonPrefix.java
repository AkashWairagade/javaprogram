package com.basics.string.practice;

public class CommonPrefix {

    public static void main(String[] args) {
       String[] strs = {"flower", "flow" , "flo"};

        System.out.print(  longestCommonPrefix(strs));

    }
    public static String longestCommonPrefix(String[] strs) {
        //strs = {"flower", "flow" , "flight"}
        
        if(strs.length ==0) {
            return "";
        }
        String prefix = strs[0];
        
        for (int i=1; i<=strs.length-1; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;

        
    }
}
