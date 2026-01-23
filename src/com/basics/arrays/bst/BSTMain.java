package com.basics.arrays.bst;

public class BSTMain {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(40);
        bst.insert(50);
        bst.insert(45);

        System.out.println(bst.root.right.left.value);
    }
}
