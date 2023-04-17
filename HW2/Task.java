// Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // инициализируем переменные
            int sum = 0; // сумма положительных чисел
            int prev = scanner.nextInt(); // предыдущее число
            int current = scanner.nextInt(); // текущее число

            // используем цикл while для перебора чисел в последовательности
            while (current != 0) {
                // проверяем, является ли предыдущее число положительным, а текущее число отрицательным
                if (prev > 0 && current < 0) {
                    // если это так, добавляем предыдущее число к сумме
                    sum += prev;
                }

                // обновляем значения prev и current для следующей итерации цикла
                prev = current;
                current = scanner.nextInt();
            }

            // выводим сумму на экран
            System.out.println(sum);
        }
    }
}
