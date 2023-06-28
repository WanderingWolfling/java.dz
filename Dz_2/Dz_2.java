import java.io.FileWriter;
import java.io.IOException;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = { 5, 3, 8, 1, 2 };

        try (FileWriter writer = new FileWriter("log.txt")) {
            writer.write("Initial Array: ");
            printArray(array, writer);

            bubbleSort(array, writer);

            writer.write("Sorted Array: ");
            printArray(array, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void bubbleSort(int[] array, FileWriter writer) throws IOException {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    writer.write("Iteration: " + (i + 1) + ", Swap: " + array[j] + " <-> " + array[j + 1] + "\n");
                }
            }
        }
    }

    public static void printArray(int[] array, FileWriter writer) throws IOException {
        for (int i = 0; i < array.length; i++) {
            writer.write(array[i] + " ");
        }
        writer.write("\n");
    }
}
