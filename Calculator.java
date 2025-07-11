public class Calculator {

    // Static variables to hold the numbers for calculation
    private static double num1 = 25.0;
    private static double num2 = 5.0;

    // Static method for addition
    public static double add() {
        return num1 + num2;
    }

    // Static method for subtraction
    public static double subtract() {
        return num1 - num2;
    }

    // Static method for multiplication
    public static double multiply() {
        return num1 * num2;
    }

    // Static method for division
    public static double divide() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; // Not a Number
        }
    }

    public static void main(String[] args) {
        System.out.println("Static Calculator Results:");
        System.out.println("Addition: " + add());
        System.out.println("Subtraction: " + subtract());
        System.out.println("Multiplication: " + multiply());
        System.out.println("Division: " + divide());
    }
}
