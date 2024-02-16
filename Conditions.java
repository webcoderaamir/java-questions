import java.util.*;

// if else

public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("equal");
        } else {
            if (a > b) {
                System.out.println("a is greater");
            } else {
                System.out.println("a is lesser");
            }
        }
    }
}

// int x = sc.nextInt();
// if (x % 2 == 0) {
// System.out.println("even number");
// } else {
// System.out.println("odd number");
// }

// int age = sc.nextInt();
// if (age > 18) {
// System.out.println("You are adult");
// } else {
// System.out.println("You are not adult");
// }
