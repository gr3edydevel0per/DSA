import java.util.*;

public class Checking {
    
    public static void main(String[] args) {

        System.out.println("Let's try to use this");

        // Creating nodes using custom LinkedList class
        LinkedList list = new LinkedList();

        

        list.createNode(234);
        list.createNode(2);
        list.createNode(56);
        list.createNode(3456);

        // Traversing the linked list
        list.traverse();

        list.search(56);
    }
}
