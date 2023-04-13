public class task4 {
    public static void main(String[] args) {
        for (int q = 0; q <= 9; q++) {
            for (int w = 0; w <= 9; w++) {
                for (int e = 0; e <= 9; e++) {
                    if (isValidEquation(q, w, e)) {
                        System.out.printf("%d + %d = %d\n", q, w, e);
                    }
                }
            }
        }
    }

    private static boolean isValidEquation(int q, int w, int e) {
        String equation = String.format("%d%d+%d=%d", q, w, w, e);
        if (equation.length() != 7) {
            return false;
        }
        String[] parts = equation.split("\\+");
        if (parts.length != 2) {
            return false;
        }
        int leftOperand = Integer.parseInt(parts[0]);
        int rightOperand = Integer.parseInt(parts[1]);
        return (leftOperand + rightOperand == e);
    }
}

// Здесь мы используем вложенные циклы для перебора всех возможных значений для q, w и e от 0 до 9. 
// Для каждой комбинации значений мы вызываем метод isValidEquation, который проверяет, является ли полученное уравнение верным. 
// Метод формирует уравнение в виде строки, заменяя знаки вопроса на текущие значения q и w, и затем разбивает строку на левую и правую части, используя знак + как разделитель.
// Если обе части являются числами, метод складывает их и сравнивает с e. Если уравнение верно, метод возвращает true, и мы выводим его на экран.