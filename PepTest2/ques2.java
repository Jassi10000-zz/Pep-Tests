
import java.util.Scanner;

public class ques2 {
    public static Scanner sc = new Scanner(System.in);

    public static void pattern(int n) {
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(count + "\t");
                count++;
            }

            if(i < n/2){
                count+=n;
            }else if(i == n/2){
                count-=(2*n);
            }else{
                count -= (3*n);
            }
            
            System.out.println();
        }
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */

        int n = sc.nextInt();
        pattern(n);
    }
}