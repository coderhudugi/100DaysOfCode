package Day1;

import static Day1.PrimeNonredundant.isPrime;

public class PrimeFactors {

    public static void main(String[] args) {
        int n = 12;
        //pairs are interchangeable
        //Naive solution, optimised to square root
        for(int i=2;i*i<n;i++) {
            if(isPrime(i)) {
                int x=i;
                while(n%x==0) {
                    System.out.println(i);
                    x=x*i;
                }
            }
        }

        //Efficient solution
        for(int i=2;i*i<n;i++) {
            while(n%i==0) {
                System.out.println(i);
                n=n/i;
            }
        }
        if(n>1) System.out.println(n);


    }
}
