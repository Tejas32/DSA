public class DecimalToBinary {

    public static void decTobin(int num) {
        int pow = 0;
        int bin = 0;
        while(num > 0) {
            bin = bin + (num%2)*(int)Math.pow(10, pow);
            pow++;
            num = num/2;
        }
        System.out.println(bin);
    }
    
    public static void main(String[] args) {
        decTobin(8);
    }
}
