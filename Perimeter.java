public class Perimeter {

    // Method to calculate the perimeter of a square
    public double calculatePerimeter(double side) {
        return 4 * side;
    }

    // Method to calculate the perimeter of a rectangle
    public double calculatePerimeter(double length, double breadth) {
        return 2 * (length + breadth);
    }

    // Method to calculate the perimeter of a circle
    public double calculatePerimeter(double radius, boolean isCircle) {
        double pi = 22.0 / 7.0;
        return 2 * pi * radius;
    }

    public static void main(String[] args) {
        Perimeter perimeter = new Perimeter();

        double squareSide = 5.0;
        double rectangleLength = 7.0;
        double rectangleBreadth = 4.0;
        double circleRadius = 3.0;

        // Calculating perimeters
        double squarePerimeter = perimeter.calculatePerimeter(squareSide);
        double rectanglePerimeter = perimeter.calculatePerimeter(rectangleLength, rectangleBreadth);
        double circlePerimeter = perimeter.calculatePerimeter(circleRadius, true);

        // Displaying results
        System.out.println("Perimeter of Square: " + squarePerimeter);
        System.out.println("Perimeter of Rectangle: " + rectanglePerimeter);
        System.out.println("Perimeter of Circle: " + circlePerimeter);
    }
}

/*
    OUTPUT:
    Perimeter of Square: 20.0
    Perimeter of Rectangle: 22.0
    Perimeter of Circle: 18.857142857142858

 */