import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberListOperations {
    public static void main(String[] args) {
        List<Integer> numbers = generateRandomNumbers(10, 1, 100);

        System.out.println("List: " + numbers);

        // 1) Удаление четных чисел
        removeEvenNumbers(numbers);
        System.out.println("List after removing even numbers: " + numbers);

        // 2) Поиск минимального значения
        int min = findMinValue(numbers);
        System.out.println("Minimum value: " + min);

        // 3) Поиск максимального значения
        int max = findMaxValue(numbers);
        System.out.println("Maximum value: " + max);

        // 4) Поиск среднего значения
        double average = findAverageValue(numbers);
        System.out.println("Average value: " + average);
    }

    public static List<Integer> generateRandomNumbers(int count, int min, int max) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            int num = random.nextInt(max - min + 1) + min;
            numbers.add(num);
        }
        return numbers;
    }

    public static void removeEvenNumbers(List<Integer> numbers) {
        numbers.removeIf(num -> num % 2 == 0);
    }

    public static int findMinValue(List<Integer> numbers) {
        int min = Integer.MAX_VALUE;
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findMaxValue(List<Integer> numbers) {
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static double findAverageValue(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.size();
    }
}
