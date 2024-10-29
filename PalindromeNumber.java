//WAP to check whether given number is palindrome or not
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Prompt user to take the input
        System.out.println("Enter a integer number: ");
        int a= sc.nextInt();

        int hundreds= a / 100;
        int tens = (a/10) % 10;
        int unit = a % 10;
        int reversedNumber = (unit * 100) + (tens * 10) + hundreds;
        //System.out.println("Reversed number is: " +reversedNumber);
        // Check whether given number is palindrome or not
        if( a==reversedNumber){
            System.out.println( a + " is a palindrome");
        }
        else {
            System.out.println(a +" is not a palindrome number.");
        }

    }
}
/*
    OUTPUT:
    Enter a integer number:
    121
    Reversed number is: 121
    121 is palindrome
 */