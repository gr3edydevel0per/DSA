import java.util.*;

public class ConvertAtoB{
    
    //XOR is used to find diff bits and then using the right shift operator we have counted number of set bits
    static int method1(int num1, int num2) {
        
        int ans, check, count = 0;

        ans = num1 ^ num2;

        while(ans != 0) {

            check = ans & 1;

            if(check == 1)
                count++;
                
            ans = ans >> 1;

        }
            
        return count;

    }
    //XOR is used to find the different bits, and then n & n-1 is performed(reduces set bit by one with each iteration) until n != 0
    static int method2(int num1, int num2) {

        int ans, count = 0;
        ans = num1 ^ num2;

        while(ans != 0) {
            count++;
            ans = ans & (ans - 1);
        }

        return count;
    }

    public static void main(String[] args) {


        int num1, num2, countM1, countM2;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first num : ");
        num1 = input.nextInt();

        System.out.print("Enter the second num : ");
        num2 = input.nextInt();

        countM1 = method1(num1, num2);
        countM2 = method2(num1, num2);

        System.out.println("The number of bits to be changed : " + countM1);
        System.out.println("The number of bits to be changed : " + countM2);

    }

}