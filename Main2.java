
import java.util.*;

public class Main2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        CallOperation co = new CallOperation();
        while (true) {
            System.out.println("1.Count Unique Palindromes");
            System.out.println("2.Fibonacci Sequence Nth Number");
            System.out.println("3.Snake Case to Camel Case Conversion");
            System.out.println("4.Count Consonants in a String \r");
            System.out.println("5.Binary to Decimal Conversion ");
            System.out.println("6.Characters in a String ");
            System.out.println("7.Character Frequency in a String ");
            System.out.println("8.. Prime Number Checker");
            System.out.println("9.Number to Words Converter");
            System.out.println("10.Longest Substring Without Repeating Characters");
            System.out.println("11.Exit ");
            System.out.println("Enter choice from 1 to 11:");
            int c = sc.nextInt();
            sc.nextLine();
            switch (c) {
                case 1:
                    System.out.println("Enter a string :");
                    String string = sc.nextLine();
                    System.out.println("the no of palindromes are:" + co.countUniquePalindromes(string));

                    break;
                case 2:
                    System.out.println("enter a no");
                    int number = sc.nextInt();
                    System.out.println("the fibonaaci number is :" + co.nthFibonacciNumber(number));
                    break;
                case 3:
                    System.out.println("Enter string in snakecase:");
                    String string1 = sc.nextLine();
                    System.out.println("the camelcase is:" + co.snakeToCamelcase(string1));

                    break;
                case 4:
                    System.out.println("Enter string :");
                    String string2 = sc.nextLine();
                    System.out.println("the consonants are:" + co.countConsonants(string2));
                    break;
                case 5:
                    System.out.println("enter string:");
                    String string3 = sc.nextLine();
                    System.out.println("the binary to decimal is:" + co.binaryTodecimal(string3));

                    break;
                case 6:
                    System.out.println("enter string:");
                    String string4 = sc.nextLine();
                    System.out.println(
                            "The string with characters according to frequency is:" + co.expandCharacters(string4));
                    break;
                case 7:
                    System.out.println("enter string:");
                    String string5 = sc.nextLine();
                    System.out.println("character frequency: " + co.findFrequency(string5));
                    break;
                case 8:
                    System.out.println("enter number:");
                    int number1 = sc.nextInt();
                    System.out.println("the sorted string is:" + co.checkPrime(number1));

                    break;
                case 9:
                    System.out.println("enter number:");
                    int number2 = sc.nextInt();
                    System.out.println("the number in words is:" + co.numberToWords(number2));
                    break;
                case 10:
                    System.out.println("enter string:");
                    String string6 = sc.nextLine();
                    System.out.println("the longest non repeating substring is:" + co.longestSubstring(string6));

                    break;
                case 11:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
