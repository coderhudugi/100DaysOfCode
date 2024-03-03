package Day1;

public class ComputePower {
    public static void main(String[] args) {
        int x=3, n=4;
        System.out.println(power(x,n));
        System.out.println(powerIterative(x,n));

    }

    static int power(int x,int n) {
        //TC+SC = logn
        if(n==0) return 1;
        int temp=power(x,n/2);
        temp=temp*temp;
        if(n%2==0) return temp;
        else return temp*x;
    }

    static int powerIterative(int x,int n) {
        //TC=logn, SC = O(1)
        int res=1;
        while(n>0) {
            if(n%2!=0) {
                res=res*x;
            }
            x=x*x;
            n=n/2;
        }
        return res;
    }
}
