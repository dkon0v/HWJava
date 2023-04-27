import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task11 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(7);
        numbers.add(2);
        numbers.add(15);

        int minValue = Collections.min(numbers);
        int maxValue = Collections.max(numbers);

        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double averageValue = sum / numbers.size();

        System.out.println("Minimum value: " + minValue);
        System.out.println("Maximum value: " + maxValue);
        System.out.println("Average value: " + averageValue);
    }
}