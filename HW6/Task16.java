import java.util.*;

public class Task16 {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList(
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"
        );

        Map<String, Integer> nameCountMap = new HashMap<>();

        // Подсчет количества повторений имен
        for (String employee : employees) {
            String name = employee.split(" ")[0]; // Извлечение имени из строки
            nameCountMap.put(name, nameCountMap.getOrDefault(name, 0) + 1);
        }

        // Сортировка по убыванию популярности
        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(nameCountMap.entrySet());
        sortedEntries.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        // Вывод результатов
        for (Map.Entry<String, Integer> entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
