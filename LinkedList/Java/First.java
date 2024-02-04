import java.util.*;

public class First {
    
    public static void main(String[] args) {

        System.out.println("Let's try to use this");

        // Creating nodes using custom LinkedList class
        LinkedList list = new LinkedList();

        list.createNode(234);
        list.createNode(2);
        list.createNode(56);
        list.createNode(36);
        list.createNode(46);
        list.createNode(86);
        list.createNode(3456);

        // Traversing the linked list
        list.traverse();

        // Now, what do we need to do in this is that we need to create groups of "k", and then just reverse
        // that part of the linkedlist and place it in its correct order in the parent linked list :)

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of k: ");
        int k = input.nextInt();

        list.kNodesReverse(k);

    }
}
