package com.basics.arrays.bst;


public class BinarySearchTree {
    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    Node root;

    BinarySearchTree() {
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }

        Node currNode = root;

        while (true) {

            if (newNode.value == currNode.value) {
                return false;
            }

            if (newNode.value < currNode.value) {

                if (currNode.left == null) {
                    currNode.left = newNode;
                    return true;
                }
                currNode = currNode.left;

            } else {

                if (currNode.right == null) {
                    currNode.right = newNode;
                    return true;
                }
                currNode = currNode.right;

            }


        }


    }


}
