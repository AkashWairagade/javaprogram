package com.basics.string.practice;

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




}
