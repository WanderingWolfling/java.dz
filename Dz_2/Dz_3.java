import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggingCalculator {
    private static final Logger logger = Logger.getLogger(LoggingCalculator.class.getName());
    private static FileHandler fileHandler;

    public static void main(String[] args) {
        try {
            fileHandler = new FileHandler("calculator.log");
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
            logger.setLevel(Level.ALL);

            Scanner scanner = new Scanner(System.in);

            logger.info("Enter the first number: ");
            double num1 = scanner.nextDouble();

            logger.info("Enter the second number: ");
            double num2 = scanner.nextDouble();

            logger.info("Enter the operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            double result = 0;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    logger.warning("Invalid operator!");
                    return;
            }

            logger.info("Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fileHandler != null) {
                fileHandler.close();
            }
        }
    }
}
