// 6857
public class McLaughlin3 {
    public static void main(String[] args) {
        long num = 600851475143L;
        long LPF = 0;

        for (long i = 2; i <= num; i++) {
            while (num % i == 0) {
                LPF = i;
                num /= i;
            }
        }

        System.out.println(LPF);
    }
}

