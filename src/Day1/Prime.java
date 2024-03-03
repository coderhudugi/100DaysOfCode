package Day1;

public class Prime {
    public static void main(String[] args) {
        int n=2;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) {
                System.out.println("Prime!");
                break;
            }
        }
        System.out.println("Not prime!");
    }
}
