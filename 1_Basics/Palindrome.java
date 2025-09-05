public class Palindrome{

    public static void palindrome(int num) {
        int initialnum = num;
        int pow =0;
        int revNum =0;
        int lastDigit;
        while(num > 0) {
            lastDigit = num %10;
            revNum = revNum * 10 + lastDigit;
            pow++;
            num = num/10;
        }
        System.out.println(revNum);
        if (revNum == initialnum) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
    
    public static void main(String[] args) {
        palindrome(121);
    }
}