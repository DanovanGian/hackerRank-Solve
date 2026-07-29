import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            
            String[] bahasa = new String[3];
            int[] nilai = new int[3];
            
            for ( int i = 0; i < 3; i++){
                bahasa[i] = scan.next();
                nilai[i] = scan.nextInt();
            }
            
            System.out.println("================================");
            
            for ( int i = 0; i < 3; i++){
                System.out.printf("%-15s%03d%n", bahasa[i], nilai[i]);
            }
            System.out.println("================================");
    }
}


