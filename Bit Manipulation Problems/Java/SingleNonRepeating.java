import java.util.*;

public class SingleNonRepeating {

    public static void main(String[] args) {

        int size, ans=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        size = input.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter all the elements of the array : ");

        for(int i=0; i<size; i++) {
            arr[i] = input.nextInt();
            ans ^= arr[i];
        }

        System.out.println(ans);
    }

}