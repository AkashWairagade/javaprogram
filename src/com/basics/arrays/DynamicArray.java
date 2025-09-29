package com.basics.arrays;

public class DynamicArray {

    private int[] arrays;
    private int size;
    DynamicArray(int capacity) {
        arrays= new int[capacity];
    }

    public void insert(int item){
        if(size==arrays.length) {
            int[] arraysCopy= new int[arrays.length*2];

            for (int i=0; i<arrays.length;i++) {
                arraysCopy[i]=arrays[i];
            }
            arrays= arraysCopy;
        }
        arrays[size++] = item;
    }

   public void print(){
        for (int i=0;i<size; i++){
            System.out.print(arrays[i] +" ");
        }
       System.out.println();
   }

   public int removeAt(int index) {
        int result=0;
        if (index >= size) {
            throw new InvalidInput("Index is not in range !!");
        }
        result=arrays[index];
        for (int i=index ; i< arrays.length-1; i++) {
            arrays[index] =arrays[++index];
        }
        size--;
        return result;

   }



}

class InvalidInput extends RuntimeException {

    InvalidInput (String name) {
        super(name);
    }
}