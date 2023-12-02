// 25164150
public class McLaughlin6 {
        public static void main(String[] args) {
            int n = 100;
            int sumOfSquares = calculateSumOfSquares(n);
            int squareOfSum = calculateSquareOfSum(n);
    
            int difference = squareOfSum - sumOfSquares;
    
            System.out.println(difference);
        }
    
        private static int calculateSumOfSquares(int n) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i * i;
            }
            return sum;
        }
    
        private static int calculateSquareOfSum(int n) {
            int sum = n * (n + 1) / 2;
            return sum * sum;
        }
    }
    

