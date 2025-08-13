package linkedlist;

import java.util.Objects;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        length++;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;

    }

    public void insert(int index, int value) {}

    public Node removeLast() {
        if (length == 0) return null;
        Node curr = head;
        Node prev = head;
        while(Objects.nonNull(curr.next)) {
            prev = curr;
            curr = curr.next;
        }
        tail = prev;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return curr;
    }

    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }

        return temp;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ► ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node get(int index) {
        if (index < 0 || index > length) return null;
        Node temp = head;
        for(int i = 0; i < index; i++ ) {
            temp = temp.next;
        }
        return temp;
    }

    public void set(int index, int value) {
        if (index < 0 || index > length) return;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
}