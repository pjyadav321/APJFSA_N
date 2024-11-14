//Write  a java program for Autoboxing.


public class Autoboxing {
    public static void main(String[] args) {
        // Autoboxing: converting primitive type int to Integer object
        int primitiveInt = 10;
        Integer wrapperInt = primitiveInt;  // auto-conversion from int to Integer

        // Display the results
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Autoboxed Integer: " + wrapperInt);

        // Autoboxing in arithmetic operations
        Integer result = wrapperInt + 20;  // Unboxing wrapperInt, performing addition, and autoboxing the result back to Integer

        System.out.println("Result of adding 20 to autoboxed Integer: " + result);
    }
}

/*
    OUTPUT:
    Primitive int: 10
    Autoboxed Integer: 10
    Result of adding 20 to autoboxed Integer: 30
 */
