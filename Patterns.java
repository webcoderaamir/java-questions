import java.util.*;

// Nested loops

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of Columns: ");
        int n = sc.nextInt();

        // System.out.print("Enter the no. of Rows: ");
        // int m = sc.nextInt();

        // <------ 0-1 Triangle Pattern -------->
        // for (int i = 1; i <= n; i++) {
        // // inner loop
        // for (int j = 1; j <= i; j++) {
        // int sum = i+j;
        // if (sum % 2 == 0) {
        // System.out.print("1 "); // Even
        // } else {
        // System.out.print("0 "); // Odd
        // }
        // }
        // System.out.println();
        // }

        // <------ Floyd's Triangle Pattern with Number -------->
        // int number = 1;

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(number+" ");
        // number++;
        // }
        // System.out.println();
        // }

        // <------ Inverted Half Pyramid Pattern with Number -------->
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n-i+1; j++) {
        // System.out.print(j+" ");
        // }
        // System.out.println();
        // }

        // <------ Half Pyramid Pattern with Number -------->
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j+" ");
        // }
        // System.out.println();
        // }

        // <------ Inverted Half Pyramid Pattern rotated 180 deg -------->
        // for (int i = 1; i <= n; i++) {
        // // inner loop - space print
        // for (int j = 1; j <= n-i; j++) {
        // System.out.print(" ");
        // }

        // // inner loop - print star
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }

        // System.out.println();
        // }

        // <------ Inverted Half Pyramid Pattern -------->
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // <------ Half Pyramid Pattern -------->
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // <------ Hollow Rectangle Pattern -------->
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= m; j++) {
        // if(i == 1 || j == 1 || i == n || j == m) { // for space
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // <------ Solid Rectangle Pattern -------->
        // outer loop
        // for (int i = 1; i <= n; i++) {
        // // inner loop
        // for (int j = 1; j <= m; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

    }
}
