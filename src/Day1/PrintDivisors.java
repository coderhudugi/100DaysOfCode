package Day1;

public class PrintDivisors {

    public static void main(String[] args) {
        //Efficient + unsorted

        int n=25;

        for(int i=1;i*i<=n;i++) {
            if(n%i==0) {
                System.out.println(i);
                if (i != n/i) System.out.println(n / i);
            }
        }

        int j;
        //Sorted
        for(j=1;j*j<n;j++) {
            if(n%j==0) {
                System.out.println(j);
            }
        }

        for(;j>=1;j--){
            if(n%j==0) {
                System.out.println(n/j);
            }
        }

    }
}
