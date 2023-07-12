import java.util.Scanner;

public class CalculatorWithUndo {
    private static double memory = 0;
    private static boolean isMemorySet = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;

        while (true) {
            System.out.print("Enter an operator (+, -, *, /) or 'q' to quit: ");
            String operator = scanner.nextLine();

            if (operator.equalsIgnoreCase("q")) {
                break;
            }

            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();

            switch (operator) {
                case "+":
                    result = add(result, number);
                    break;
                case "-":
                    result = subtract(result, number);
                    break;
                case "*":
                    result = multiply(result, number);
                    break;
                case "/":
                    result = divide(result, number);
                    break;
                case "undo":
                    result = undo(result);
                    break;
                default:
                    System.out.println("Invalid operator!");
                    break;
            }

            System.out.println("Result: " + result);
            scanner.nextLine(); // Чтение пустой строки после ввода числа
        }
    }

    public static double add(double a, double b) {
        double result = a + b;
        saveToMemory(result);
        return result;
    }

    public static double subtract(double a, double b) {
        double result = a - b;
        saveToMemory(result);
        return result;
    }

    public static double multiply(double a, double b) {
        double result = a * b;
        saveToMemory(result);
        return result;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return a;
        }
        double result = a / b;
        saveToMemory(result);
        return result;
    }

    public static double undo(double currentResult) {
        if (isMemorySet) {
            System.out.println("Undo last operation");
            return memory;
        } else {
            System.out.println("No operation to undo");
            return currentResult;
        }
    }

    public static void saveToMemory(double result) {
        memory = result;
        isMemorySet = true;
    }
}
