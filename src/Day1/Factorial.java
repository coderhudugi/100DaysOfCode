package Day1;

public class Factorial {

    public static void main(String[] args) {
        int n = 5;
        int fact = 1;
        if(n == 0)
            System.out.println("Factorial is="+fact);
        else {
            for (int i = 1; i <= 7; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial is="+fact);
        }


    }
}
