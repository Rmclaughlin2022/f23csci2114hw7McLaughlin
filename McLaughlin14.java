// 837799
public class McLaughlin14 {
        public static void main(String[] args) {
            long limit = 1000000;
            long longestChain = 0;
            long startingNumber = 0;
    
            for (long i = 1; i < limit; i++) {
                long currentNumber = i;
                long chainLength = 0;
    
                while (currentNumber != 1) {
                    if (currentNumber % 2 == 0) {
                        currentNumber = currentNumber / 2;
                    } else {
                        currentNumber = 3 * currentNumber + 1;
                    }
                    chainLength++;
                }
    
                if (chainLength > longestChain) {
                    longestChain = chainLength;
                    startingNumber = i;
                }
            }
    
            System.out.println(startingNumber);
        }
    }
