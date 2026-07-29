import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] nilai = new int[3];
        
        for(int i = 0; i < nilai.length; i++ ){
            nilai[i] = scan.nextInt();

        }
        for(int i = 0; i < nilai.length; i++ ){
            System.out.println(nilai[i]);

        }
    }
}
