public class sumOfNnatural {

    public static int Sum(int n) {
        int sum =0;

        for(int i = 0;i<=n;i++) {
            sum += i;
        }
        
        return sum;
    }

    public static void main(String[] args) {
        int num = 10;
        int ans = Sum(num);
        System.out.println(ans);
    }
    
}
