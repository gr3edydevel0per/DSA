import java.util.*;

public class SetBit{

    public static void main(String[] args) {

        int num, index, ans;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter any number : ");

        num = input.nextInt();

        System.out.print("Index of bit that you want to set : ");

        index = input.nextInt();

        ans = num | (1 << index);

        System.out.println("After bit is set : " + ans);

    }

}