import java.util.*;

public class TwoDArrays {

    // Ques. Print matrix from input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of Columns : ");
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];

        // rows
        for (int i = 0; i < rows; i++) {
            // column
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}

    // Qs. Take a matrix as input from the user. Search for a given number x and print the indexes at which it occurs.
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the rows : ");
    //     int rows = sc.nextInt();
    //     System.out.print("Enter the columns : ");
    //     int cols = sc.nextInt();
    //     int arr[][] = new int[rows][cols];

    //     //input
    //     for (int i = 0; i < rows; i++) {
    //         for (int j = 0; j < cols; j++) {
    //             arr[i][j] = sc.nextInt();
    //         }
    //     }

    //     System.out.print("Find the x value : ");
    //     int x = sc.nextInt();

    //     // output
    //     for (int i = 0; i < rows; i++) {
    //         for (int j = 0; j < cols; j++) {
    //             // compare with x
    //             if (arr[i][j] == x) {
    //                 System.out.println("x found at location : " + "(" + i + ", " +  j + ")");
    //             }
    //         }
    //     }
    // }



    
    


