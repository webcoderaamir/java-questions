import java.util.*;
public class conceptOne {

   // Ques 10. Write a program to print Fibonacci series of n terms where n is input by user :
    // 0 1 1 2 3 5 8 13 21 ..... 
    // In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
    public static void fibonacciValue(int n) {
        int a = 0;
        int b = 1;

        System.out.print(a+" ");

        if (n > 1) {
            //find nth term
            for (int i = 2; i <= n; i++) {
                System.out.print(b+" ");
                //the concept below is called swapping
                int temp = b;
                b = a + b;
                a = temp;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of terms : ");
        int n = sc.nextInt();

        fibonacciValue(n);
    }



    // Ques 9. Write a function that calculates the Greatest Common Divisor of 2 numbers.
    // public static void findGCD(int n1, int n2) {
    //     while (n1 != n2) {
    //         if (n1 > n2) {
    //             n1 = n1 - n2;
    //         } else {
    //             n2 = n2 - n1;
    //         }
    //     }
    //     System.out.println("GCD is : " + n2);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.print("Enter your first number : ");
    //     int n1 = sc.nextInt();

    //     System.out.print("Enter your second number : ");
    //     int n2 = sc.nextInt();

    //     findGCD(n1, n2);
    // }
    



    // Ques 8. Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
    // public static void powerValue(int x, int n) {
    //     int result = 1;
    //     for (int i = 1; i <= n; i++) {
    //         result = result * x;
    //     }
    //     System.out.println(result);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.print("Enter x Number : ");
    //     int x = sc.nextInt();

    //     System.out.print("Enter n Number : ");
    //     int n = sc.nextInt();

    //     powerValue(x, n);
    // }



    // Ques 7. Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int postive = 0, negative = 0, zeros = 0;
    //     System.out.print("Enter press 1 to Continue & 0 to Exit : ");
    //     int input = sc.nextInt();

    //     while (input == 1) {
    //         System.out.print("Enter your Number : ");
    //         int num = sc.nextInt();

    //         if (num > 0) {
    //             postive++;
    //         } else if (num < 0) {
    //             negative++;
    //         } else {
    //             zeros++;
    //         }

    //         System.out.print("Press 1 to Continue & 0 to Exit : ");
    //         input = sc.nextInt();
    //     }

    //     System.out.println("Positive number : " + postive);
    //     System.out.println("Negative number : " + negative);
    //     System.out.println("Zero number : " + zeros);
    // }



    // Ques 6. Write an infinite loop using do while condition.
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int i = 0;
    //     do {
    //         System.out.println(i++);
    //     } while (true);
    // }



    // Ques 5. Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
    // public static void eligibleToVote(int age){
    //     if(age >= 18){
    //         System.out.println("Eligible to vote");
    //     } else {
    //         System.out.println("Not eligible to vote");
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.print("Enter your Age : ");
    //     int age = sc.nextInt();

    //     eligibleToVote(age);
    // }



    // Ques 4. Write a function that takes in the radius as input and returns the circumference of a circle.
    // public static void calculateCirc(int radius){
    //     double circumference = 2 * Math.PI * radius;
    //     System.out.println("Circumference of Circle : " + circumference);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.print("Enter Radius: ");
    //     int radius = sc.nextInt();

    //     calculateCirc(radius);
    // }



    // Ques 3. Write a function which takes in 2 numbers and returns the greater of those two.
    // public static void greaterNumber(int a, int b){
    //     if(a > b){
    //         System.out.println(a);
    //     } else {
    //         System.out.println(b);
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.print("Enter first number: ");
    //     int a = sc.nextInt();

    //     System.out.print("Enter second number: ");
    //     int b = sc.nextInt();

    //     greaterNumber(a, b);
    // }



    // Ques 2. Write a function to print the sum of all odd numbers from 1 to n.
    // public static void sumOfOddNumbers(int n){
    //     int sum = 0;
    //     for (int i = 1; i <= n; i += 2){
    //         sum += i;
    //     }
    //     System.out.println(sum);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.print("Enter odd Number : ");
    //     int n = sc.nextInt();

    //     sumOfOddNumbers(n);
    // }


    
    // Ques 1. Enter 3 numbers from the user & make a function to print their average.
    // public static void findAverage(int a, int b, int c){
    //     int sum = a + b + c;
    //     double average = (double) sum / 3;
    //     System.out.println("Average : " + average);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.print("Enter first number: ");
    //     int a = sc.nextInt();

    //     System.out.print("Enter second number: ");
    //     int b = sc.nextInt();

    //     System.out.print("Enter third number: ");
    //     int c = sc.nextInt();

    //     findAverage(a, b, c);
    // }

}

    



    


