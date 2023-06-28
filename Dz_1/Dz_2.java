// 2) Вывести все простые числа от 1 до 1000

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 1000:");
        for (int i = 1; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
