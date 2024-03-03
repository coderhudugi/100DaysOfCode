package Day1;

import java.util.Arrays;

public class Eratosthenes {
    public static void main(String[] args) {
        int n = 10;
        boolean[] arr = new boolean[n + 1];
        Arrays.fill(arr, true);

        for (int i = 2; i * i <= n; i++) {
            if (arr[i]) {
                //Naive solution = starts from 2*i but since those terms are already handled take squares O(n^3/2)
                for (int j = 2 * i; j <= n; j = j + i)
                    arr[j] = false;
            }
        }
        for (int i = 2; i < n; i++)
            if (arr[i]) System.out.println(i);


        //Optimised - TC - O(nlog logn)
    for(int i = 2; i<=n;i++)

    {
        if (arr[i]) {
            System.out.println(i);
            for (int j = i * i; j <= n; j = j + i)
                arr[j] = false;
        }
    }
}


}
