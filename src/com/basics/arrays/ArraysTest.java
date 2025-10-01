package com.basics.arrays;

public class ArraysTest {
    public static void main(String[] args) {
        DynamicArray nums = new DynamicArray(5);
        nums.insert(10);
        nums.insert(80);
        nums.insert(30);//remove
        nums.insert(40);
        nums.insert(50);
        nums.insert(60);
        nums.print();

        //System.out.println( "removed Item ==> "+ nums.removeAt(5));
        nums.print();
        nums.reverse();;
        nums.print();
        nums.max();
    }
}
