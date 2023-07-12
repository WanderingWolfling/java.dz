import java.util.LinkedList;

public class MyQueue<T> {
    private LinkedList<T> elements = new LinkedList<>();

    public void enqueue(T element) {
        elements.addLast(element);
    }

    public T dequeue() {
        return elements.removeFirst();
    }

    public T first() {
        return elements.getFirst();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }
}

// Пример использования
public class QueueExample {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("First element: " + queue.first());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("First element: " + queue.first());
    }
}
