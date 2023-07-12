import java.util.*;

public class Lesson {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

        // Инициализация телефонной книги
        addPhoneNumber(phoneBook, "Федя", "1234567890");
        addPhoneNumber(phoneBook, "Настя", "9876543210");
        addPhoneNumber(phoneBook, "Федя", "5555555555");
        addPhoneNumber(phoneBook, "Настя", "1111111111");
        addPhoneNumber(phoneBook, "Федя", "9999999999");
        Scanner scan = new Scanner(System.in);
        while (true)
        {
            System.out.print("Введите имя - ");
            String name = scan.nextLine();
            System.out.print("Введите номер телефона - ");
            String tel = scan.nextLine();
            addPhoneNumber(phoneBook,name,tel);
            System.out.print("Продолжить? да\\нет - ");
            String answer = scan.nextLine().toLowerCase();

            if (answer.equals("нет") || answer.equals("не"))
            {
                break;
            }

        }




        // сортировка по количеству телефонов и вывод
        List<Map.Entry<String, ArrayList<String>>> sortedEntries = sortByPhoneNumber(phoneBook);
        for (Map.Entry<String, ArrayList<String>> entry : sortedEntries) {
            System.out.println("Имя: " + entry.getKey());
            System.out.println("Телефоны: " + entry.getValue());
            System.out.println();
        }
    }

    public static void addPhoneNumber(HashMap<String, ArrayList<String>> phoneBook, String name, String phoneNumber) {
        if (phoneBook.containsKey(name)) {
            ArrayList<String> numbers = phoneBook.get(name);
            if (!numbers.contains(phoneNumber)) {
                numbers.add(phoneNumber);
            }
        } else {
            ArrayList<String> numbers = new ArrayList<>();
            numbers.add(phoneNumber);
            phoneBook.put(name, numbers);
        }
    }

    public static List<Map.Entry<String, ArrayList<String>>> sortByPhoneNumber(HashMap<String, ArrayList<String>> phoneBook) {
        List<Map.Entry<String, ArrayList<String>>> sortedEntries = new ArrayList<>(phoneBook.entrySet());
        Collections.sort(sortedEntries, new Comparator<Map.Entry<String, ArrayList<String>>>() {
            @Override
            public int compare(Map.Entry<String, ArrayList<String>> entry1, Map.Entry<String, ArrayList<String>> entry2) {
                return entry2.getValue().size() - entry1.getValue().size();
            }
        });
        return sortedEntries;
    }
}

