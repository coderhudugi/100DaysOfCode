package Day1;

public class HCFNaive {
    public static void main(String[] args) {
        int n=4, m=6;
        int res = Math.min(m,n);

        while(res > 0) {
            if(m%res == 0 && n%res == 0) {
                System.out.println("HCF is "+res);
                break;
            }
            res--;
        }
        if(res == 0)
        System.out.println("No common, hence 1");
    }
}
