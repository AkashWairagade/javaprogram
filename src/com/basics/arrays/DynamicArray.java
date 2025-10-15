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
        for (int i=index ; i< size; i++) {
            arrays[i] =arrays[i+1];
        }
        size--;
        return result;

   }

   public int max() {
        int max = Integer.MIN_VALUE;

       for (int i = 0; i <size ; i++) {
           if ( arrays[i] >max ){
               max=arrays[i];
           }

       }
       System.out.println("max number is "+max);
        return max;
   }

   public void reverse() {
        int left=0;
        int right=size-1;
        //[10,20,30,40]
        while (left < right){
            int temp=arrays[left];
            arrays[left]=arrays[right];
            arrays[right] = temp;
            left ++;
            right --;
        }


   }

    public int indexOf (int element) {
        for (int i = 0; i < size; i++) {
            if (arrays[i]==element){
                return i;
            }
        }
        return -1;
    }



}

class InvalidInput extends RuntimeException {

    InvalidInput (String name) {
        super(name);
    }
}