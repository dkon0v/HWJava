public class task1 {
    public static void main(String[] args) {
        int n = 10; // пример для n=10
        
        long triangle = 0;
        long factorial = 1;
        
        for (int i = 1; i <= n; i++) {
            triangle += i;
            factorial *= i;
        }
        
        System.out.println("n-ое треугольное число: " + triangle);
        System.out.println("n! : " + factorial);
    }
}
