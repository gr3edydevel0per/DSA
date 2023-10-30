import java.util.*;

public class LL {

    private Node head;
    private Node tail;

    public Node insertAtFirst(int val) {

        Node temp = new Node(val);
        temp.next = head;
        head = temp;

        return head;

    }

    public void reverse() {

        Node prev = head;

        if(prev == null || prev.next == null) {
            return;
        }

        Node curr = prev.next;
        Node head = curr.next;

        while(curr.next != null) {

            curr.next = prev;
            head.next = curr;

            curr = prev.next;
            head = curr.next;

        }

        System.out.println();

        display();
        
    }

    public void display() {

        Node temp = head;

        while(temp != null) {

            System.out.println(temp.val + " ");
            temp = temp.next;

        }

    }

    private class Node {

        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

    }

    public static void main(String args[]) {

        LL node = new LL();

        for(int i=0; i<10; i++){
            node.insertAtFirst(i);
        }

        node.display();

        node.reverse();

        // node.display();

    }

}