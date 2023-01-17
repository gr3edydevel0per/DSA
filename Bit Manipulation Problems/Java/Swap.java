import java.util.*;  

public class Swap {
    public static void main(String[] args) {

        int num1, num2;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number  : ");
        num1 = input.nextInt();

        System.out.print("Enter the second number : ");
        num2 = input.nextInt();

        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.print("Num 1 : ");
        System.out.println(num1);
        
        System.out.print("Num 2 : ");
        System.out.println(num2);
    }
}