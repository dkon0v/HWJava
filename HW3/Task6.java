// Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the length of the sequence: ");
            int length = input.nextInt();

            int prevNum = Integer.MIN_VALUE; // предыдущее число из последовательности
            boolean isIncreasing = true; // флаг, обозначающий, является ли последовательность возрастающей
            System.out.print("Enter the sequence of numbers: ");
            for (int i = 0; i < length; i++) {
                int num = input.nextInt();
                if (num <= prevNum) { // если текущее число меньше или равно предыдущему, последовательность не является возрастающей
                    isIncreasing = false;
                    break;
                }
                prevNum = num; // сохраняем текущее число для следующей итерации
            }

            if (isIncreasing) {
                System.out.println("The sequence is increasing.");
            } else {
                System.out.println("The sequence is not increasing.");
            }
        }
    }
}

//Данный код сначала запрашивает длину последовательности чисел , а затем запрашивает саму последовательность. 
// Для каждого числа в последовательности код проверяет, является ли оно больше предыдущего числа prevNum. 
// Если текущее число меньше или равно предыдущему, то последовательность не является возрастающей и устанавливается флаг  в значение false.
// Наконец, программа выводит сообщение о том, является ли последовательность возрастающей.