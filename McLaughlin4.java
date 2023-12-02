//906609
public class McLaughlin4 {
        public static void main(String[] args) {
            int LPalindrome = 0;
    
            for (int i = 100; i < 1000; i++) {
                for (int j = 100; j < 1000; j++) {
                    int product = i * j;
                    if (isPalindrome(product) && product > LPalindrome) {
                        LPalindrome = product;
                    }
                }
            }
    
            System.out.println(LPalindrome);
        }
    
        private static boolean isPalindrome(int number) {
            String strNumber = String.valueOf(number);
            String reversed = new StringBuilder(strNumber).reverse().toString();
            return strNumber.equals(reversed);
        }
    }
    
