// 232792560
public class McLaughlin5 {
    public static void main(String[] args) {
        int result = findSmallestMultiple(20);
        System.out.println(result);
    }

    private static int findSmallestMultiple(int upperLimit) {
        int result = 1;

        for (int i = 2; i <= upperLimit; i++) {
            result = lcm(result, i);
        }

        return result;
    }

    private static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }
}
