public class PrimesInRange {

    public static boolean isPrime(int num) {
        // We have to include all edge cases even for numbers 1 and below

        if(num <=1 ) {
            return  false;
        }
        
        if(num == 2) {
            return true;
        }
        if(num > 2 ) {
            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void primesInRange(int range) {
        for(int i = 2; i <= range; i++){
            boolean prime = isPrime(i);
            if(prime) { // if prime == true
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        primesInRange(20);
    }
}
