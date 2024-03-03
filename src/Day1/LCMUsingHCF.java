package Day1;

public class LCMUsingHCF {
    public static void main(String[] args) {
        int m=4, n=10;
        int gcd = HCFEuclideanOptim.gcd(m, n);
        if(n==0)
            System.out.println(m);
        else {
            System.out.println(m*n/gcd);
        }
    }
}
