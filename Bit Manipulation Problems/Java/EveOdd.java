import java.util.*;  

public class EveOdd {
    public static void main(String[] args) {

        int num, ans;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter any number : ");
        num = input.nextInt();

        ans = num & 1;

        if(ans == 1)
            System.out.println("The number you have entered Odd");
        else
            System.out.println("The number that you hav entered is Even");

    }
}
