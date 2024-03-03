package Day1;

public class TrailingZerosBasic {
    public static void main(String[] args) {
        int n = 10;
        int fact = FactorialRecursive.fact(n);
        int trail = 0;

        while (fact > 0) {
            int div = fact%10;
            if(div == 0) {
                trail++;
                fact = fact/10;
            }
            else
                break;
        }

        System.out.println("Trailing zeros="+trail);
    }
}
