package Day1;

public class HCFEuclideanOptim {
    public static void main(String[] args) {
        //Pls make sure n>m
        int m=10, n=4;
        System.out.println("GCD is "+gcd(m,n));
    }

    public static int gcd(int m, int n){
        if(n==0) return m;
        System.out.println(m+" "+n);
        return gcd(n, m%n);

    }
}
