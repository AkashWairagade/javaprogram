package com.basics.number;

public class FactorialTrailingZero {

    public static void main(String[] args) {
        System.out.println("trailing Zero count in factorial " + countTrailingZerosInfactorials(2));
    }


    public static int countTrailingZerosInfactorials (int num ) {
        // 5! = 1 * 2 * 3* 4 * 5  =120
        // 20! = 1 * 2 * 3* 4* 5 * 6 *7 * 8 * 9 * 10* 11 * 12 * 13 * 14 *15* 16*17 * *18 *19 *20
        // 20! = 1 * 2 * 3* 4* 5 * 6 *7 * 8 * 9 * 10* 11 * 12 * 13 * 14 *15* 16*17 * *18 *19 *20 * 21 * 22* 23* 24 *25
         // multiplication of 5 = 5  * 10  * 15  *20  *25
         //                     = 5^1  5^1  5^1  5^1  5^2
        // 2 * 10 = 20
        // 2 * 10* 10 = 200

        //        long factorial = 1;
        //        for (int i = 1; i <=num ; i++) {
        //
        //            factorial *=i;
        //
        //        }
        //        System.out.println(factorial);

        int count=0;
        int powerOfFive=5;
        //count = n/5 + n/25 + n/125

        while (num >=powerOfFive) {
            count +=num/powerOfFive;
            powerOfFive *=powerOfFive;
        }
        return count;

    }





}
