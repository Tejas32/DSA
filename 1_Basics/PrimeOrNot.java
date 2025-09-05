public class PrimeOrNot {

    public static boolean prime(int num){
        for(int i=2;i<Math.sqrt(num);i++) {
            if(num%i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int number = 14;
        boolean prime = prime(number);
        if(prime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
    
}
