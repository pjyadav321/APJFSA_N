// Swapping without using third variable
public class SwappingWithoutThirdVar {
    public static void main(String[] args) {
        //Initializing the values for variables
        int a = 6;
        int b = 8;
        System.out.println("Before Swapping: ");
        System.out.println("a = " +a);
        System.out.println("b = "+b);

        // Swapping without temporary variable
        a = a+b;
        b = a-b;
        a = a-b;

        // Printing the swapped values
        System.out.println("After Swapping: ");
        System.out.println("a = " +a);
        System.out.println("b = "+b);
    }
}
/*
    Before Swapping:
    a = 6
    b = 8
    After Swapping:
    a = 8
    b = 6
 */