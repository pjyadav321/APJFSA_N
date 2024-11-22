// Write a program demonstrating  Exception handling using try catch for Arithmatic Exception.
public class TryCatch {
    public static void main(String[] args) {
        // Variables for demonstration
        int numerator = 10;

        try
        {
            // Attempting division
            int result = numerator / 0; // This will cause an ArithmeticException (division by zero)
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e)
        {
            // Handling the exception
            System.out.println("Error: Cannot divide by zero.");
            System.out.println("Exception Message: " + e.getMessage());
        }

    }
}

/*
    OUTPUT:
    Error: Cannot divide by zero.
    Exception Message: / by zero

 */