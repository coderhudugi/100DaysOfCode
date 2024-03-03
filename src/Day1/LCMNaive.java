package Day1;

public class LCMNaive {
    public static void main(String[] args) {
        int n=4, m=6;
        int res = Math.max(m,n);

        while(true) {
            if(res%m == 0 && res%n == 0) {
                System.out.println("HCF is "+res);
                break;
            }
            res++;
        }
        if(res == 0)
        System.out.println("No common, hence 1");
    }
}
