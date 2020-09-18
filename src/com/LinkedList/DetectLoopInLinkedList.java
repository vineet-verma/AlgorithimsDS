package com.LinkedList;

/* Floyd,s cycle detection algo
 * */
public class DetectLoopInLinkedList {
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.push(1);
        llist.push(4);
        llist.push(3);
        llist.push(5);
        llist.push(16);
        llist.push(11);
        llist.head.next.next = llist.head;
        llist.detectLoop();
    }
}

class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        /* 3. Make next of new Node as head */
        new_node.next = head;
        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    public void detectLoop() {
        //Logic - we will have two pointer, slowPointer will move 1 step and fastPointer will move 2 step.
        //If they meet ever then there is loop otherwise no cycle
        Node slow_ptr = head, fast_ptr = head;
        boolean isCycleFlag = false;
        while (slow_ptr != null && fast_ptr != null && fast_ptr.next != null) {
            slow_ptr = slow_ptr.next;
            fast_ptr = fast_ptr.next.next;
            if (slow_ptr == fast_ptr) {
                isCycleFlag = true;
                break;
            }
        }

        System.out.println("Cycle status : " + isCycleFlag);
    }
}

