// WAP to Check whether given number is even or odd
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      //Prompt user to take the input
      System.out.println("Enter a integer number: ");
      int n = sc.nextInt();

      // Check number is even or odd
      if(n%2 == 0){
          System.out.println("Number is even.");
      }
      else {
          System.out.println("Number is odd.");
      }
    }
}
/*
    OUTPUT:
        Enter a integer number:
        40
        Number is even.
 */