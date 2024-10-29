/*
WAP to display following pattern:
1
12
123
1234
12345
 */
public class Pattern1 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the pattern

        for (int i = 1; i <= rows; i++) {
            // Print numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
/*
    OUTPUT:
    1
    12
    123
    1234
    12345
 */