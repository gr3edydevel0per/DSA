import java.util.*;

public class LinkedList {

    private int val;
    private LinkedList next;
    private LinkedList head = null;
    
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
}
