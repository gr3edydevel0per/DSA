// You need to print the pattern for "N" number of rows, where N is any number entered by user.

// N=6

// 1
// 1 1
// 1 2 1
// 1 3 3  1
// 1 4 6  4  1
// 1 5 10 10 5 1
// N=5

// 1
// 1 1
// 1 2 1
// 1 3 3  1
// 1 4 6  4  1

import java.util.*;

public class Test {

    public static void main(String args[]) {

        int rows, sum;
        int num1 = 11;
        int num2;

        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();

        arr1.add(1);
        arr1.add(1);

        // for(int i=0; i<2; i++) {
        //     System.out.println(arr2.get(i));
        // }

        Scanner input =  new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        rows = input.nextInt();

        for(int i=0; i<rows; i++) {

            for(int j=0; j<=i; j++) {

                if(j == 0 || j == i) {
                    System.out.print("1");
                    arr2.add(1);
                }
                else {        
                    sum = arr1.get(j-1) + arr1.get(j);
                    System.out.print(sum);
                    arr2.add(sum);
                }

            }

            if(i > 1) {
                arr1.clear();
                arr1.addAll(arr2);

            }
            arr2.clear();
            System.out.println();

        }

    }

}