import java.util.*;

public class Functions {

    // ques factorial 5! = 5!*4!*3!*2!*1! 
    public static void printFactorial(int n) {   //declare function
        //condition -ve no.
        if(n < 0){
            System.out.println("Invalid Number");
            return;
        }

        int factorial = 1;
        //loop
        for(int i = n; i >= 1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {   //call function
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        printFactorial(n);
    }


    
    // ques. Print sum of all odd no. 1 to n.
    // public static int sumOfOddNumbers(int n) {
    // int sum = 0;
    //     for (int i = 1; i <= n; i += 2) {
    //     sum += i;
    //     }
    //     return sum;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter a number: ");
    //     int n = sc.nextInt();

    //     int sum = sumOfOddNumbers(n);

    //     System.out.println("Sum of all odd numbers from 1 to " + n + " is: " + sum);
    // }



    // ques
    // public static int multiplyNum(int a, int b) {
    //     return a * b;
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.print("Enter 1st no : ");
    //     int a = sc.nextInt();

    //     System.out.print("Enter 2nd no : ");
    //     int b = sc.nextInt();

    //     System.out.println("multiply of two numbers : " + multiplyNum(a, b));
    // }


    // ques
    // public static int printSum(int a, int b){
    // int sum = a + b;
    // return sum;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();

    // int calculate = printSum(a, b);
    // System.out.println(calculate);
    // }


    // ques
    // public static void printMyName(String name, int age) { //declare function
    // System.out.println(name);
    // System.out.println(age);
    // return;
    // }

    // public static void main(String[] args) { // call function
    // Scanner sc = new Scanner(System.in);
    // String name = sc.next();
    // int age = sc.nextInt();

    // printMyName(name, age);
    // }

}
