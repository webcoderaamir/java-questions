import java.util.*;
public class Functions {

    // Ques. Recursive functions
    // public static int printFactorial(int n){
    //     if(n < 0) return 0;

    //     if(n == 0){
    //         return 1;
    //     }
    //     // Recursive case: n! = n * (n-1)!
    //     return n * printFactorial( n - 1 );
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Check Factorial Number : ");
    //     int n = sc.nextInt();

    //     int result = printFactorial(n);
    //     System.out.println("Result : " + result);
    // }



    // Ques. Make a function to print the table of a given number n.
    // public static void printTable(int n){
    //     for(int i = 1; i < 11; i++){
    //         System.out.println(i*n);
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Print The Table : ");
    //     int n = sc.nextInt();

    //     printTable(n);
    // }



    // ques.Make a function to check if a given number n is even or not.
    // public static void isEven(int n){
    //     if(n % 2 == 0){
    //         System.out.println("isEven");
    //     } else {
    //         System.out.println("isOdd");
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Check Even Number : ");
    //     int n = sc.nextInt();

    //     isEven(n);
    // }



    // Ques. Make a function to check if a number is prime or not.
    // public static void isPrime(int n){
    //     if(n <= 1){
    //         System.out.println("Not a prime number");
    //         return;
    //     }
    //     boolean prime = true;
    //     for(int i = 2; i <= Math.sqrt(n); i++){
    //         if(n % i == 0){
    //             prime = false;
    //             break;
    //         }
    //     }

    //     if(prime){
    //         System.out.println("Prime number");
    //     } else {
    //         System.out.println("Not a prime number");
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Check Prime Number : ");
    //     int n = sc.nextInt();

    //     isPrime(n);
    // }



    // ques factorial 5! = 5!*4!*3!*2!*1! 
    // public static void printFactorial(int n) {   //declare function
    //     //condition -ve no.
    //     if(n < 0){
    //         System.out.println("Invalid Number");
    //         return;
    //     }

    //     int factorial = 1;
    //     //loop
    //     for(int i = n; i >= 1; i--){
    //         factorial = factorial * i;
    //     }
    //     System.out.println(factorial);
    //     return;
    // }
    // public static void main(String[] args) {   //call function
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter a number: ");
    //     int n = sc.nextInt();

    //     printFactorial(n);
    // }


    
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
