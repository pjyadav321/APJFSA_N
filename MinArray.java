//Create Java Program to print the smallest element in an array

public class Main {
    public static void main(String[] args) {
           int a[] = {11, 34, 67, 89, 2, 21, 1};
           int minArray=a[0];

        // Find the smallest element
        for (int i = 1; i <a.length; i++)
        {
            if(a[i] < minArray)
            {
            minArray = a[i];
            }
        }
        // Print the smallest element
        System.out.println("Smallest element is " + minArray);
    }
}

/*
    OUTPUT:
    Smallest element is 1
 */