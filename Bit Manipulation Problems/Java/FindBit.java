import java.util.*;

public class FindBit {

    public static void main(String[] args) {

        int num, index, ans;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter any number : ");

        num = input.nextInt();

        System.out.print("Enter the index of bit : ");

        index = input.nextInt();

        ans = (1 << index) & num;

        if(ans == 0)
            System.out.println("Bit at index " + index + " is : 0");
        else
            System.out.println("Bit at index " + index + " is : 1");


    }

}