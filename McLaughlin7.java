// 104743
public class McLaughlin7 {
        public static void main(String[] args) {
            int targetIndex = 10001;
            int prime = findPrime(targetIndex);
            System.out.println(prime);
        }
    
        private static int findPrime(int n) {
            if (n == 1) {
                return 2;
            }
    
            int count = 1; 
            int candidate = 3; 
    
            while (count < n) {
                if (isPrime(candidate)) {
                    count++;
                }
    
                if (count < n) {
                    candidate += 2; 
                }
            }
    
            return candidate;
        }
    
        private static boolean isPrime(int num) {
            if (num < 2) {
                return false;
            }
    
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
    
            return true;
        }
    }

