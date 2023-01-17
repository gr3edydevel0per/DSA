import java.util.*;

public class ClearBit {

    public static void main(String[] args) {

        int num, index, ans;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter any number : ");
        
        num = input.nextInt();

        System.out.print("Enter the index that you want to clear : ");

        index = input.nextInt();

        ans = (~(1 << index)) & num;

        System.out.println("After bit is cleared : " + ans);

    }

}