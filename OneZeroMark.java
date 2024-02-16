import java.util.*;

public class OneZeroMark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;

        do {
            System.out.println("Enter the score (out of 100): ");
            int marks = sc.nextInt();

            if(marks >= 90 && marks <= 100) {
                System.out.println("Excellent score");
            } else if ( marks >= 60 && marks <= 89) {
                System.out.println("Nice score");
            } else if ( marks >= 33 && marks <= 59) {
                System.out.println("Pass score");
            } else {
                System.out.println("Failed score");
            }

            System.out.println("Want to Continue ? (Yes(1) or no(0))");
            input = sc.nextInt();

        } while (input == 1);

    }
}
