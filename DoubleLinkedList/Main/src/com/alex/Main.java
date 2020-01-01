package com.alex;

public class Main {

    public static void main(String[] args) {

    }

    static class DoublyLinkedList {
        public Node head;
        public Node tail;

        public void setHead(Node node) {
            if(head == null && tail == null) {
                head = node;
                tail = node;
                return;
            }
            // Write your code here.
        }

        public void setTail(Node node) {
            // Write your code here.
        }

        public void insertBefore(Node node, Node nodeToInsert) {
            // Write your code here.
        }

        public void insertAfter(Node node, Node nodeToInsert) {
            // Write your code here.
        }

        public void insertAtPosition(int position, Node nodeToInsert) {
            // Write your code here.
        }

        public void removeNodesWithValue(int value) {
            // Write your code here.
        }

        public void remove(Node node) {
            // Write your code here.
        }

        public boolean containsNodeWithValue(int value) {
            // Write your code here.
        }
    }

    // Do not edit the class below.
    static class Node {
        public int value;
        public Node prev;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}