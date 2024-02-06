//Create W

import java.util.*;

public class CreatingW {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int rows;

        System.out.print("Enter the number of rows: ");
        rows = input.nextInt();

        for(int i=0; i<rows; i++) {

            for(int j=0; j <= rows*2; j++) {

                if(( j == i ) || (j==rows*2-i)) {

                    if(j==rows-1 && i==rows-1){}
                    else
                        System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }

            System.out.println();

        }

    }

}