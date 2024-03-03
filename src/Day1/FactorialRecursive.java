package Day1;

public class FactorialRecursive {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial is="+fact(number));
    }

    public static int fact(int n) {
        if (n==0) return 1;
        else
            return n*fact(n-1);
    }
}
