import java.util.*;

public class PatternsAdvance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Columns: ");
        int n = sc.nextInt();

        // System.out.print("Enter the number of Rows: ");
        // int m = sc.nextInt();


        // <------ Hollow Butterfly Pattern -------->
        // // uppercase
        // for (int i = 1; i <= n; i++) {
        // // first part
        // for (int j = 1; j <= i; j++) {
        // if (j == 1 || j == i) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }

        // // spaces
        // int spaces = 2 * (n - i);
        // for (int j = 1; j <= spaces; j++) {
        // System.out.print(" ");
        // }

        // // second part
        // for (int j = 1; j <= i; j++) {
        // if (j == 1 || j == i) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // // lowercase
        // for (int i = n; i >= 1; i--) {
        // // first part
        // for (int j = 1; j <= i; j++) {
        // if (j == 1 || j == i) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }

        // // spaces
        // int spaces = 2 * (n - i);
        // for (int j = 1; j <= spaces; j++) {
        // System.out.print(" ");
        // }

        // // second part
        // for (int j = 1; j <= i; j++) {
        // if (j == 1 || j == i) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // <------ Diamond Pattern -------->
        // // upper half
        // for (int i = 1; i <= n; i++) {
        // // spaces
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }

        // // stars
        // int stars = 2 * i - 1;
        // for (int j = 1; j <= stars; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // // lower half
        // for (int i = n; i >= 1; i--) {
        // // spaces
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }

        // // stars
        // int stars = 2 * i - 1;
        // for (int j = 1; j <= stars; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // <------ Palindromic in no. Pattern -------->
        // for (int i = 1; i <= n; i++) {
        // // spaces
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }

        // // first half part -> backward i to 1
        // for (int j = i; j >= 1; j--) {
        // System.out.print(j);
        // }

        // // second half part -> forward 1/2 to i
        // for (int j = 2; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // <------ Number Pyramid Pattern -------->
        // for (int i = 1; i <= n; i++) {
        // // spaces
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }

        // // print i
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }

        // <------ Hollow Rhombus Pattern -------->
        // for (int i = 1; i <= n; i++) {
        // // rhombus space
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }

        // // stars
        // for (int j = 1; j <= m; j++) {
        // // hollow space
        // if (i == 1 || j == 1 || i == n || j == m) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // <------ Solid Rhombus Pattern -------->
        // for (int i = 1; i <= n; i++) {
        // // spaces
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }

        // // stars
        // for (int j = 1; j <= n; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // <------ Butterfly Pattern -------->
        // // uppercase
        // for (int i = 1; i <= n; i++) {
        // // 1st part
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }

        // // spaces
        // int spaces = 2 * (n - i);
        // for (int j = 1; j <= spaces; j++) {
        // System.out.print(" ");
        // }

        // // 2nd part
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // // lowercase
        // for (int i = n; i >= 1; i--) {
        // // 1st part
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }

        // // spaces
        // int spaces = 2 * (n - i);
        // for (int j = 1; j <= spaces; j++) {
        // System.out.print(" ");
        // }

        // // 2nd part
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

    }
}
