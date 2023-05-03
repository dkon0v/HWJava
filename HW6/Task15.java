import java.util.HashMap;
import java.util.Map;

public class Task15 {
    public static void main(String[] args) {
        String text = "Мама мыла раму, мама очень старалась. Мыла, мыла, мыла. Мама, мама, мама.";

        String searchWord = "мама"; // Искомое слово

        Map<String, Integer> wordCountMap = new HashMap<>();

        // Разделение текста на слова и подсчет 
        String[] words = text.split("[^а-яА-ЯёЁ]+");
        for (String word : words) {
            String lowercaseWord = word.toLowerCase();

            // Если слово присутствует в карте
            if (wordCountMap.containsKey(lowercaseWord)) {
                int count = wordCountMap.get(lowercaseWord);
                wordCountMap.put(lowercaseWord, count + 1);
            } else {
                // Если слово встречается впервые
                wordCountMap.put(lowercaseWord, 1);
            }
        }

        // Вывод результатов
        int count = wordCountMap.getOrDefault(searchWord, 0);
        System.out.println("Количество вхождений слова \"" + searchWord + "\": " + count);
    }
}