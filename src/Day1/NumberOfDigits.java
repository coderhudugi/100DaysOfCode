package Day1;

public class NumberOfDigits {
    public static void main(String[] args) {
        int number = 59888999;
        int count = 0;

        while(number > 0) {
            number = number / 10;
            count++;
        }

        System.out.println("No of digits="+count);

    }
}
