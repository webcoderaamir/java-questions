import java.util.*;
// String are immutable
public class Strings {

    // Ques. Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the email : ");
    //     String email= sc.next();
    //     String username = "";

    //     for (int i = 0; i < email.length(); i++) {
    //         if (email.charAt(i) == '@') {
    //             break;
    //         } else {
    //             username += email.charAt(i);
    //         }
    //     }
    //     System.out.println(username);

    //     // String username = email.substring(0, email.indexOf("@"));
    //     // System.out.println(username);
    // }




    // Ques. Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’.

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the string : ");
    //     String str = sc.next();
    //     String result = "";

    //     for (int i = 0; i < str.length(); i++) {
    //         if (str.charAt(i) == 'e') {
    //             result += 'i';
    //         } else {
    //             result += str.charAt(i);
    //         }
    //     }
    //     System.out.println(result);

    //     // String result = str.replace('e', 'i');
    //     // System.out.println(result);
    // }
    



    // Ques. Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter size : ");
    //     int size = sc.nextInt();
    //     String array[] = new String[size];
    //     int totLength = 0;

    //     for (int i = 0; i < size; i++) {
    //         array[i] = sc.next();
    //         totLength += array[i].length();
    //     }
    //     System.out.println(totLength);
    // }



    // Ques. ToString Method of String class.
    // public static void main(String[] args) {
    //     int num = 123;
    //     String str = Integer.toString(num);
    //     System.out.println(str.length());
    // }



    // Ques. ParseInt Method of Integer class.
    // public static void main(String[] args) {
    //     String str = "123";
    //     int num = Integer.parseInt(str);
    //     System.out.println(num);
    // }



    // Ques. substring
    // public static void main(String[] args) {
    //     // compare
    //     // String sentence = "My name is Aamir";
    //     // String name = sentence.substring(11, sentence.length());

    //     String sentence = "AamirAyub";
    //     String name = sentence.substring(5);
    //     System.out.println(name);

    // }



    // Ques. compareTo()
    // public static void main(String[] args) {
    //     // compare
    //     String name1 = "Spider";
    //     String name2 = "Spider";

    //     // 1. s1 > s2 : +ve value
    //     // 2. s1 == s2 : 0
    //     // 3. s1 < s2 : -ve value

    //     if(name1.compareTo(name2) == 0) {
    //         System.out.println("equal");
    //     } else {
    //         System.out.println("not equal");
    //     }

    //     // if(new String("Tony") == new String("Tony")) {
    //     //     System.out.println("equal");
    //     // } else {
    //     //     System.out.println("not equal");
    //     // }

    // }


    // Ques. length & charAt
    // public static void main(String[] args) {
    //     // concatenation of strings
    //     String FirstName = "Tony";
    //     String SecondName = "Stark";
    //     String FullName = FirstName + "@" + SecondName;
    //     // Tony@Stark
    //     System.out.println(FullName.length());
    //     // charAt => break words
    //     for (int i = 0; i < FullName.length(); i++) {
    //         System.out.println(FullName.charAt(i));
    //     }
    // }


    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     String name = sc.nextLine();
    //     System.out.println("full name : " + name);
    // }

}
