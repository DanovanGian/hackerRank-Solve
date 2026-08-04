import java.util.*;
import java.io.*;
import java.math.*;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int banyak = in.nextInt();
        

        for (int i = 0; i < banyak; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int hasil;

            for (int j = 0; j < n; j++) {
                int power = (int) Math.pow(2, j);
                hasil = a + power * b;
                a = hasil;
                System.out.printf("%d ", hasil);

            }
            System.out.println();
        }
        in.close();
    }
}
