import java.util.*;

public class Checking {
    
    public static void main(String[] args) {

        // Creating nodes using custom LinkedList class
        LinkedList list = new LinkedList();
        Scanner input = new Scanner(System.in);
        
        int numOfNodes, value;

        System.out.print("Enter the number of nodes: ");
        numOfNodes = input.nextInt();

        for(int count = 0; count < numOfNodes; count++) {
            System.out.print("Enter the value of " + count + " node: ");
            value = input.nextInt();
            list.createNode(value);
        }

        // Traversing the linked list
        list.traverse();

    }
}
