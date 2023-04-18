// Дана последовательность N целых чисел. Найти сумму простых чисел.

import java.util.Scanner;

public class Task5 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the length of the sequence: ");
            int length = input.nextInt();

            int sum = 0;
            System.out.print("Enter the sequence of numbers: ");
            for (int i = 0; i < length; i++) {
                int num = input.nextInt();
                if (isPrime(num)) {
                    sum += num;
                }
            }

            System.out.println("Sum of prime numbers in the sequence: " + sum);
        }
    }
}

// код сначала запрашивает длину последовательности чисел у пользователя, а затем запрашивает саму последовательность. 
// Для каждого числа в последовательности код проверяет, является ли оно простым числом с помощью функции isPrime.
// Если число является простым, то оно добавляется к сумме простых чисел sum.
// Наконец, программа выводит сумму простых чисел в заданной последовательности.