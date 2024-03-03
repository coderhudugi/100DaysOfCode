package Day1;

public class TrailingZerosEfficient {

    public static void main(String[] args) {
        // n/5 + n/25 + n/125... so on
        int n = 5;
        int res = 0;

        for (int i=5;i<=n;i=i*5) {
            res = res+n/i;
        }
        System.out.println(res);
    }
}
