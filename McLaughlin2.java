// 4613732

public class McLaughlin2 {
    public static void main(String[] args) {
        int limit = 4000000;
        int sum = 0;
        int fib1 = 1;
        int fib2 = 2;

        
        while (fib2 <= limit) {
            if (fib2 % 2 == 0) {
                sum += fib2;
            }

            int temp = fib1 + fib2;
            fib1 = fib2;
            fib2 = temp;

        }

        System.out.println(sum);
    }
}


