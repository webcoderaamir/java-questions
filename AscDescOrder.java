import java.util.*;
import java.util.Arrays;

public class AscDescOrder {

    // 5 Ques. Take an array of numbers as input and Get in Ascending & Descending order.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of ArrayList : ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // input
        for (int i = 0; i < size; i++) {
            System.out.print("Input : ");
            numbers[i] = sc.nextInt();
        }

        // Ascending order
        Arrays.sort(numbers);
        System.out.println("Ascending order : " + Arrays.toString(numbers));

        // Descending order
        int desc[] = new int[size];
        for (int i = 0; i < size; i++) {
            desc[i] = numbers[size - 1 - i];
        }
        System.out.println("Descending order : " + Arrays.toString(desc));
    }

}
