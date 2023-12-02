


// 233168
public class McLaughlin1 {

    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i < 1000; i++) {
            int x = i;
            if (x % 3 == 0 || x % 5 == 0) {
                sum += x;
            }
        }

        System.out.println(sum);
    }
}


