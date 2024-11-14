// Write a java program for  Unboxing.

public class Unboxing {
    public static void main(String[] args) {
        // Creating a wrapper class object (Double)
        Double wrapperDouble = 25.5;  // Using autoboxing directly without using `new Double()`

        // Unboxing: converting Double object to primitive type double
        double primitiveDouble = wrapperDouble;  // auto-conversion from Double to double

        // Display the results
        System.out.println("Wrapper Double: " + wrapperDouble);
        System.out.println("Unboxed double: " + primitiveDouble);

        // Unboxing in arithmetic operations
        double result = wrapperDouble * 2;  // Unboxing wrapperDouble, performing multiplication, and using the result as double

        System.out.println("Result of multiplying unboxed Double by 2: " + result);
    }
}

/*
    OUTPUT:
    Wrapper Double: 25.5
    Unboxed double: 25.5
    Result of multiplying unboxed Double by 2: 51.0

 */