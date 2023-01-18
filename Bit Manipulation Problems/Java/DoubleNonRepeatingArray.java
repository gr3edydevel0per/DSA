import java.util.*;

public class DoubleNonRepeatingArray {

    public static void main(String[] args) {

        int size, ans=0, check=0, count=0, bit1 = 0, bit2 = 0, tmp;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        size = input.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter all the elements of the array : ");

        for(int i=0; i<size; i++) {
            arr[i] = input.nextInt();
            ans ^= arr[i];
        }

        while(check != 1) {
            check = ans & 1;
            ans >>= 1;
            count++;
        }

        for(int i=0; i<size; i++) {

            tmp = arr[i] & (1 << count);
            if(tmp == 1)
                bit1 ^= arr[i];
            else
                bit2 ^= arr[i];
        }

        System.out.println("One : " + bit1);
        System.out.println("Two : " + bit2);

    }

}