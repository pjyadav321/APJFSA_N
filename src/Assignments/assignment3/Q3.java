import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        int asciiValue = (int) ch;
        System.out.println("ASCII value of '" + ch + "' is: " + asciiValue);
        scanner.close();
    }
}
