package com.basics.arrays;

import javax.sound.midi.Soundbank;

public class SumSubArraySizeK {

    public static void main(String[] args) {
        int [] nums ={1,3,4,6,3,5,8};
        int k = 4;

        System.out.println(subArraySumSizeK(nums,k));
    }


    public static int subArraySumSizeK(int[] nums, int k) {


        if (nums.length<k){
            throw new IllegalStateException("arr size should be greater than window size");
        }

        //1 find the first window sum  --> consider is as max sum
        int currentSum=0;
        for (int i = 0; i < k; i++) {
            currentSum +=nums[i];
        }
        int maxSum=currentSum;
         //from index 3 to n-1
        for (int i = k; i < nums.length ; i++) {
            currentSum=currentSum + nums[i] -nums[i-k];
            maxSum = Math.max(maxSum,currentSum);

        }

        return maxSum;

    }



}
