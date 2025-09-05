public class SubString{
    // si = starting index
    // ei = ending index

    public static String Substring(String str, int si, int ei) {
        String substr ="";
        for(int i= si; i<ei;i++) {
             substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        String returnedStr = Substring(str, 0, 4);
        System.out.println(returnedStr);
    }
}