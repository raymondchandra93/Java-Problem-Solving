/**
 * Key Points About Java's LinkedList<E> Implementation:
	- Doubly Linked List: 				Each node contains references to both its previous and next nodes.
	- Efficient Insertions/Deletions: 	Since it maintains both directions, insertions and deletions in the middle of the list are efficient (O(1) when the node reference is known).
	- Implements Deque Interface: 		It can function as a queue (FIFO), stack (LIFO), or list.
	- Higher Memory Usage: 				Since each node has an extra reference (prev), it uses more memory than a singly linked list.
 */

package com.raymondchandra.linkedlist.concepts;

import java.util.LinkedList;

public class LinkedListConcept {
	public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // Adding elements
        list.add(10);
        list.add(20);
        list.addFirst(5);  // Adds to the head
        list.addLast(30);   // Adds to the tail

        // Printing the list
        System.out.println("LinkedList: " + list); // [5, 10, 20, 30]

        // Removing elements
        list.remove();		// Remove 30 as the last element
        list.removeFirst(); // Removes 5
        list.removeLast();  // Removes 20

        // Display updated list
        System.out.println("After Deletion: " + list); // [10]
    }
}
