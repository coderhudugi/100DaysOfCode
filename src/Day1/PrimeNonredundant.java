package Day1;

public class PrimeNonredundant {
    public static void main(String[] args) {
        //large n only!
        int n=8;
        System.out.println(isPrime(n));
    }

    static boolean isPrime(int n) {
        if (n == 2 || n == 3) return true;
        if(n%2==0||n%3==0) return false;
        else
            for (int i = 5; i * i <= n; i = i + 6) {
                if (n % i == 0 || n % (i + 2) == 0) {
                    return false;
                }
            }
       return true;
    }



}
