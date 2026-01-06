package com.basics.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2,4,5,8};
        int target=10;
        int[] result = twoSumHashMap(nums,target);
        System.out.println(Arrays.toString(result));


    }

    // brute force
    public static int[] twoSum(int[] nums, int target) {
        //1.
        // 2 --> 4,5,8
        //2.
        //4 --> 5,8
        //3 -->
        //5 --> 8
        int[] result= new int[2];
        boolean found=false;
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if( (nums[i] + nums[j]) ==target) {
                    result[0]=i;
                    result[1]=j;
                    found=true;
                    break;
                }
            if (found)
                break;
            }

        }
       return result;
 }

 // O(n) --> space complexity O(n)

    public static int[] twoSumHashMap(int[] nums, int target) {
     int[] result = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (hashMap.containsKey(diff)) {
                result[0] = hashMap.get(diff);
                result[1] = i;
                break;
            } else {
                hashMap.put(nums[i], i);
            }
        }
        return result;
    }


   /* int[] nums = {2,4,5,8};
                    target=12

    1.
    diff = target-number;
        = 12 -2 =10

    hashMap
    [0, 0]
   doesHashMap contains 10
     yes we found break
     no

    hashMap
    [2, 0]

   2.
    hashMap
    [2, 0]
    diff = target-number;
        = 12 -4 =8
    doesHashMap contains 10
    yes we found break
    no
    [2, 0]
    [4, 1]

  3.
    hashMap
    [2, 0]
    [4, 1]
    diff = target-number;
        = 12 -5 =7
    doesHashMap contains 10
    yes we found break
    no
    [2, 0]
    [4, 1]
    [5, 2]
   4.
    hashMap
    [2, 0]
     [4, 1]
      [5, 2]
    diff = target-number;
        = 12 -8 =4
    doesHashMap contains 10
    yes we found break
            [4, 1]
    no
            [2, 0]
            [4, 1]
            [5, 2]
*/



}
