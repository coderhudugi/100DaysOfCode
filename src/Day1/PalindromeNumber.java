package Day1;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 707078;
        int orig = number;
        int rev = 0;

        while(number > 0) {
            int rem = number % 10;
            rev = rev*10 + rem;
            number = number / 10;
        }

        if(orig == rev) {
            System.out.println("YES!");
        }
        else {
            System.out.println("NO!");
        }



    }
}
