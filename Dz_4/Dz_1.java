package Dz_4;

import java.util.Li

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        LinkedList<Integer> reversedList = reverseLinkedList(linkedList);
        System.out.println("Reversed LinkedList: " + reversedList);
    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> linkedList) {
        LinkedList<Integer> reversedList = new LinkedList<>();
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            reversedList.add(linkedList.get(i));
        }
        return reversedList;
    }
}
