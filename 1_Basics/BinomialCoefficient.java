
public class BinomialCoefficient {

    public static int fact(int n){
        int f = 1;
        for(int i = 1;i<=n;i++){
            f = f * i;
        }
        return f;
    }

    public static int binomial(int n, int r){
        int numerator = (fact(n));
        int denominator = (fact(r))*(fact(n-r));

        int calc = numerator/denominator;
        return calc;
    }

    public static void main(String[] args) {
        int n=5;
        int r=2;
        int binomialCoefficient = binomial(n, r);
        System.out.println(binomialCoefficient);
    }
}
