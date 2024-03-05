import java.util.*;
public class PrimeNumber {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int findNthPrime(int n) {
        int count = 0;
        int num = 2;
        while (count < n) {
            if (isPrime(num)) {
                count++;
            }
            if (count == n) {
                return num;
            }
            num++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index no. : ");
        int input = scanner.nextInt();
        scanner.close();
        int primeNumber = findNthPrime(input);
        if (primeNumber != -1) {
            System.out.println(input + "th : " + primeNumber);
        } else {
            System.out.println("Invalid!");
        }
    }
}

// public class PrimeNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();

//         boolean isPrime = true;

//         if (n <= 1) {
//             isPrime = false;
//         } else {
//             for (int i = 2; i <= Math.sqrt(n); i++) {
//                 if (n % i == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//         }

//         if (isPrime) {
//             System.out.println(n + " is a prime number.");
//         } else {
//             System.out.println(n + " is not a prime number.");
//         }

//     }
// }