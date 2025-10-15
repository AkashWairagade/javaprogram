package com.basics.list;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        private Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    // 20 -> null    new-->30

    public void addLast (int item) {
        Node newNode = new Node(item);
        if (first==null){
            first=newNode;
            last= newNode;
        }else {
           last.next= newNode;
           last=newNode;
        }
    }

    public void addFirst(int item){
        Node newNode = new Node(item);
        if (first==null){
            first = newNode;
            last = newNode;
        }else {
           newNode.next=first;
           first=newNode;
        }


    }


    public void print() {
       if (first == null) {
            throw new IllegalStateException("linked List is Empty");
        }
        Node temp=first;
        while (temp.next!=null){
            System.out.print(temp.value +"-->");
            temp=temp.next;
        }
        System.out.println(temp.value);

    }

    public void removeFirst() {
        if (first ==null) {
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp =first;
        first= first.next;
        temp.next=null;
        System.out.println(temp.value +" is the first item and it has been removed !!! ");

    }

   public void removeLast() {

       //10-->20-->40
       if (first ==null) {
           System.out.println("LinkedList is empty");
           return;
       }
       Node current = first;
       while (current!=null) {
           if (current.next == last) break;
           current=current.next;
       }
       current.next=null;
       last=current;




   }


    public static void main(String[] args) {

        LinkedList items = new LinkedList();
        items.addLast(10);
        items.addLast(20);
        items.addLast(40);
        items.addFirst(40);
        items.addFirst(30);

        items.print();
        items.removeFirst();
        items.removeFirst();
        items.print();
        items.removeLast();
        items.print();

    }

}
