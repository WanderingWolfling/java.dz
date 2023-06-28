// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class TriangularFactorial {
    public static void main(String[] args) {
        int n = 5;
        
        int triangularNumber = calculateTriangularNumber(n);
        System.out.println("Triangular number of " + n + ": " + triangularNumber);
        
        int factorial = calculateFactorial(n);
        System.out.println("Factorial of " + n + ": " + factorial);
    }
    
    public static int calculateTriangularNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    
    public static int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
