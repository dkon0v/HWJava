import java.util.LinkedList;
import java.util.List;

public class Task13 {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        reversePrint(numbers);
    }

    public static void reversePrint(List<Integer> list) {
        if (list.isEmpty()) {
            return;
        }

        int lastElement = list.remove(list.size() - 1);
        reversePrint(list);
        System.out.println(lastElement);
    }
}
// В этом примере мы используем связанный список (LinkedList) в качестве списка чисел для вывода.

//Функция reversePrint рекурсивно вызывается до тех пор, пока список не станет пустым. На каждом шаге мы удаляем последний элемент из списка (list.remove(list.size() - 1)) и рекурсивно вызываем reversePrint с оставшейся частью списка.

// Затем мы выводим удаленный элемент на экран (System.out.println(lastElement)). Поскольку мы вызываем reversePrint после удаления элемента, вывод происходит в обратном порядке.

// В результате выполнения этого кода, вы получите вывод списка на экран в перевернутом виде. Например, для входного списка [1, 2, 3, 4, 5] результат будет:


// Обратите внимание, что этот метод изменяет исходный список, удаляя элементы по мере их обработки. Если вам нужно сохранить исходный список неизменным, можно создать копию списка перед вызовом reversePrint.