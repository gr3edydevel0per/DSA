import java.util.*;

public class Maze {

    private int getWays(int i, int j) {

        if(i == 1 || j == 1)
            return 1;

        return getWays(i - 1, j) + getWays(i, j - 1);

    }

    public static void main(String args[]) {

        int rows, cols;

        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the number rows of the matrix :");
            rows = in.nextInt();


            System.out.println("Enter the number columns of the matrix :");
            cols = in.nextInt();
        }

        Maze obj = new Maze();

        System.out.println("Answer: " + obj.getWays(rows, cols));

    }

}