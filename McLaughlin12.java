// 76576500
public class McLaughlin12 {
        public static void main(String[] args) {
            int targetDivisors = 500;
            long triangleNumber = findTriangleNumber(targetDivisors);
            System.out.println(triangleNumber);
        }
    
        private static long findTriangleNumber(int targetDivisors) {
            int currentDivisors = 0;
            long triangleNumber = 1;
            long naturalNumber = 2;
    
            while (true) {
                triangleNumber += naturalNumber;
                naturalNumber++;
    
                currentDivisors = countDivisors(triangleNumber);
    
                if (currentDivisors > targetDivisors) {
                    break;
                }
            }
    
            return triangleNumber;
        }
    
        private static int countDivisors(long number) {
            int count = 0;
            long sqrt = (long) Math.sqrt(number);
    
            for (int i = 1; i <= sqrt; i++) {
                if (number % i == 0) {
                    count += 2; 
                }
            }
    
            if (sqrt * sqrt == number) {
                count--;
            }
    
            return count;
        }
    }
    
