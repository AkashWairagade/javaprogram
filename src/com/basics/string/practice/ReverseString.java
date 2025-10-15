package com.basics.string.practice;

import java.util.Stack;

public class ReverseString {



    public char[] reverTest(char[] arr) {
        // char arr [] ={a,b,c};

        int left = 0;
        int right = arr.length-1;

        while (left< right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return arr;

    }


    public static String reverseStringUsingStack (String input){

        if (input==null || input.isEmpty()) {
            return "";
        }
        Stack<Character> stack = new Stack<>();
        // putting char in stack
        for (char ch: input.toCharArray()){
            stack.push(ch);
        }

        StringBuffer sb = new StringBuffer();

        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        System.out.println(rs.reverseStringUsingStack("abc"));
    }

}
