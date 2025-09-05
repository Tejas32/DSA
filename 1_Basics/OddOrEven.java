public class OddOrEven{

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int numberToCheck = 6;
        boolean isNumberEven = isEven(numberToCheck);

        if (isNumberEven) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
