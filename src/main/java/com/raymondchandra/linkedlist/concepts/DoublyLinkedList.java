/**
 * Double LinkedList
 * -----------------
 * 
 * Double Linked List	
Node Structure		Each node has data, a reference to the next node, and a reference to the previous node
Navigation			Can traverse both forward and backward
Memory Usage		More memory (extra pointer for the previous node)
Insertion/Deletion	Faster for deletion (direct access to previous node)
Use Cases			More efficient for complex operations like undo-redo, navigation
 */

package com.raymondchandra.linkedlist.concepts;

public class DoublyLinkedList {
	static class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            this.prev = this.next = null;
        }
    }

    private Node head;

    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Delete a node
    public void delete(int key) {
        if (head == null) return;

        if (head.data == key) {
            head = head.next;
            if (head != null) head.prev = null;
            return;
        }

        Node temp = head;
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }

        if (temp == null) return;
        if (temp.next != null) temp.next.prev = temp.prev;
        if (temp.prev != null) temp.prev.next = temp.next;
    }

    // Display list forward
    public void displayForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.displayForward();
        list.delete(20);
        list.displayForward();
    }
}
