  
import java.util.Scanner;
import java.util.Arrays;

public class ques1 {

    public static Scanner sc = new Scanner(System.in);

    public static void printDiag(int[][] arr) {

        for (int gap = 0; gap < 2*(arr[0].length - 1); gap++) {

            if(gap % 2 == 0){
                for (int i = 0, j = gap; i < arr.length && j < arr[0].length; i++, j++) {

                    System.out.println(arr[i][j]);
                }
            }else{
                for (int i = arr.length, j = arr[0].length; i > 0 && j >= gap; i--, j--) {

                    System.out.println(arr[i][j]);
                }
            }

        }

    }

    public static void main(String[] args) {

        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                arr[i][j] = sc.nextInt();
            }
        }

        printDiag(arr);
    }
}