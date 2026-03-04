@FunctionalInterface
interface ArithmeticOperation {
    double operate(double a, double b);
}

public class LambdaArithmetic {

    public static void main(String[] args) {

        // Lambda expressions
        ArithmeticOperation add = (a, b) -> a + b;
        ArithmeticOperation subtract = (a, b) -> a - b;
        ArithmeticOperation multiply = (a, b) -> a * b;
        ArithmeticOperation divide = (a, b) -> {
            if (b == 0) {
                System.out.println("Division by zero not allowed");
                return 0;
            }
            return a / b;
        };

        double x = 20;
        double y = 10;

        System.out.println("Addition: " + add.operate(x, y));
        System.out.println("Subtraction: " + subtract.operate(x, y));
        System.out.println("Multiplication: " + multiply.operate(x, y));
        System.out.println("Division: " + divide.operate(x, y));
    }
}
