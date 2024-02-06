import java.util.*;

public class LinkedList {

    private int val;
    private LinkedList next;
    private LinkedList head = null;
    
    // Linked List Basic Operations

    public void createNode(int value) {
        if (head == null) {
                    
            LinkedList node = new LinkedList();
            node.val = value;
            node.next = null;

            head = node;

        } else {
            
            LinkedList temp = head;

            while (temp.next != null)
                temp = temp.next;

            LinkedList node = new LinkedList();

            node.val = value;
            node.next = null;

            temp.next = node;

        }
    }

    public void createNode(int value, int insertBefore) {
    }

    public void search(int value) {
        
        
        LinkedList temp = head;

        while (temp != null) {

            if(temp.val == value)
                System.out.println("Element Exists!");

            temp = temp.next;

        }

    }

    public void traverse() {

        LinkedList temp = head;

        while (temp != null) {

            System.out.println(temp.val);
            temp = temp.next;

        }
    }

    // Reverse the Linked List

    public void reverse() {

        LinkedList curr = head;
        LinkedList front = head.next;
        LinkedList prev = null;


        while(curr != null) {
            front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        } 

        head = prev;

    }

    public void kNodesReverse(int k) {

        LinkedList copy =  head;
        int count = 1;

        while(copy != null) {
            if(count++ == k) {
                count = 1;
                kReverse();
            }
            copy = copy.next;
        }

    }

    // Linked List Questions Started

    // public void kCompartment(LinkedList start, LinkedList end) {

    //     Node current = start;
    //     Node prev = null;
    //     Node next = null;

    //     while (current != end) {
    //         next = current.next; // Save the next node
    //         current.next = prev;  // Reverse the link
    //         prev = current;       // Move to the next nodes
    //         current = next;
    //     }

    
    //     head = prev; // The new head is the last node of the original list

    // }

    // public void kNodesReverse(int k) {

    //     System.out.println("test");

    //     int index = 1;
    //     LinkedList temp = head;
    //     LinkedList start = temp;
    //     LinkedList end = temp;
    //     System.out.println("test");

    //     while(temp != null) {

    //         if(index++ == k) {
    //         System.out.println("Start: " + start.val + "End: " + end.val);
    //             // kCompartment(start, end);
    //              head = end;

    //                 LinkedList ahead = start.next;
    //                 LinkedList ibm;
                    
    //                 start.next = end.next;

    //                 while (start != end) {

    //                     ibm = ahead.next;
    //                     ahead.next = start;
    //                     start = ahead;
    //                     ahead = ibm;

    //                 }

    //             index = 1;
    //             start = end.next;
    //             end = start;
    //             System.out.println("test inside if");
    //         }
    //         System.out.println("Index: " + index);
    //         System.out.println(temp.val);
    //         temp = temp.next;
    //         end = end.next;

    //     }

    //     // traverse();

    // }

}
