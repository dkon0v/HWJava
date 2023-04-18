// Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the length of the array: ");
            int length = input.nextInt();

            int[] arr = new int[length];
            System.out.print("Enter the array of integers: ");
            for (int i = 0; i < length; i++) {
                arr[i] = input.nextInt();
            }

            int sumOfIndexes = 0;
            for (int i = 0; i < length; i++) {
                if (arr[i] >= 10 && arr[i] <= 99) { // если элемент массива является двузначным числом
                    sumOfIndexes += i; // увеличиваем сумму индексов
                }
                if (arr[i] < 0) { // если элемент массива отрицательный
                    arr[i] = sumOfIndexes; // заменяем его на сумму индексов
                }
            }

            System.out.print("Resulting array: ");
            for (int i = 0; i < length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
// Данный код сначала запрашивает длину массива , а затем запрашивает сам массив. 
// Для каждого элемента массива код проверяет, является ли он двузначным числом. 
// Если да, то увеличивается сумма индексов  на индекс текущего элемента i.
// Если элемент отрицательный, то он заменяется на сумму индексов . 
// Наконец, программа выводит измененный массив.//