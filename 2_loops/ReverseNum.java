public class ReverseNum {

   public static int getReversedNumber(int number) {
        int reversedNumber = 0;
        
        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            number /= 10;
        }
        
        return reversedNumber;
    }

    public static void main(String[] args) {
        int number = 10899;
        int reversed = getReversedNumber(number);
        System.out.println("The reverse of " + number + " is " + reversed);
    }  
}
