import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();

        // Добавление контактов в телефонную книгу
        addContact(phoneBook, "John", "1234567890");
        addContact(phoneBook, "John", "9876543210");
        addContact(phoneBook, "Alice", "1111111111");
        addContact(phoneBook, "Alice", "9999999999");
        addContact(phoneBook, "Bob", "5555555555");

        // Вывод контактов в порядке убывания числа телефонов
        List<Map.Entry<String, List<String>>> sortedContacts = sortContactsByNumberOfPhones(phoneBook);
        for (Map.Entry<String, List<String>> entry : sortedContacts) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void addContact(Map<String, List<String>> phoneBook, String name, String phoneNumber) {
        List<String> numbers = phoneBook.getOrDefault(name, new ArrayList<>());
        numbers.add(phoneNumber);
        phoneBook.put(name, numbers);
    }

    public static List<Map.Entry<String, List<String>>> sortContactsByNumberOfPhones(
            Map<String, List<String>> phoneBook) {
        List<Map.Entry<String, List<String>>> sortedList = new ArrayList<>(phoneBook.entrySet());
        sortedList.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));
        return sortedList;
    }
}
