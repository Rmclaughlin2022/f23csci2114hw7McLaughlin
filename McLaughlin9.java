// 31875000
public class McLaughlin9 {
    public static void main(String[] args) {
        int targetSum = 1000;
        int product = findPTP(targetSum);
        System.out.println(product);
    }
    
    private static int findPTP(int targetSum) {
         for (int a = 1; a < targetSum; a++) {
            for (int b = a + 1; b < targetSum; b++) {
                int c = targetSum - a - b;
                if (isPT(a, b, c)) {
                    return a * b * c;
                }
            }
        }
        return -1; 
    }
    
        private static boolean isPT(int a, int b, int c) {
            return (a * a + b * b == c * c);
        }
    }
    
