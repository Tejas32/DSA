public class StringPalindrome {

    public static boolean Palindrome(String str) {
        int start =0;
        int end = str.length()-1;
        while(start < end) {
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    } 
    
    public static void main(String[] args) {
        String str = "racecar";
        boolean ans = Palindrome(str);
        System.out.println(ans ? "Palindrome" : "Not a palindrome");
    }
}
