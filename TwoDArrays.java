// this file contains two 2darray program...1st one is basic 2d array declaration and printing array from user nd for 2nd question slide down.. 
import java.util.*;

public class TwoDArrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row nd col");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        // array declarations
        int[][] numbers = new int[rows][cols];

        // input
        System.out.println("enter values");
        // rows
        for (int i = 0; i < rows; i++) {
            // columns
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        // output
        System.out.println("output is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}




//-------------------------------------------------------------------------------------------------------------



// Question 2:  
// find x in  2d array.. nd print its index where it found..
import java.util.*;

public class TwoDArrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row nd col");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        // array declarations
        int[][] numbers = new int[rows][cols];

        // input
        System.out.println("enter values");
        // rows
        for (int i = 0; i < rows; i++) {
            // columns
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter number to be found");
        int x = sc.nextInt();

        // traverse the array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // compare with x
                if (numbers[i][j] == x) {
                    System.out.println("x found at location (" + i + ", " + j + ")");
                }
            }
        }

    }
}

