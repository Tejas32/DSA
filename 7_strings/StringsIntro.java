
import java.util.Scanner;

public class StringsIntro{
    public static void main(String[] args){
        // char ch[] = {'a','b','c','d'};
        // String str = "abcd";
        // String str1 = new String("abcd");

        // // Strings are IMMUTABLE

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);

        // String fullname = "tony stark";
        // System.out.println(fullname.length());

        //concatenation
        String firstName = "Tejas";
        String LastName = "Mundhe";
        String FullName= firstName + " " + LastName;
        System.out.println(FullName);

        for(int i=0;i<FullName.length();i++){
            System.out.print(FullName.charAt(i));
        }
    }
}