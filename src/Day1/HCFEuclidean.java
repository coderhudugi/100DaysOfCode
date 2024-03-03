package Day1;

public class HCFEuclidean {

    public static void main(String[] args) {
        int m=4, n=10;
        while(m!=n) {
            if (m > n) {
                m = m-n;
            }
            else {
                n = n-m;
            }
        }

        System.out.println(m);
    }
}
