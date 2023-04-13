import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        int n = 1000;
        boolean[] primes = new boolean[n+1];
        Arrays.fill(primes, true); // считаем, что все числа простые
        primes[0] = false;
        primes[1] = false;

        // решето Эратосфена
        for (int i = 2; i*i <= n; i++) {
            if (primes[i]) {
                for (int j = i*i; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }

        // выводим все простые числа
        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
