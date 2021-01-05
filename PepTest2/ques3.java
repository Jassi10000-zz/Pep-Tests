import java.io.*;
import java.util.*;
import java.util.Scanner;

public class ques3 {
    public static Scanner sc = new Scanner(System.in);     
               
    public static boolean checkArr(int n , int[]a , int[] b){
        if(n % 2 != 0){
            for(int k=0;k<a.length;k++){
                if(a[k] != b[k]) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = sc.nextInt();

        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        int[]b = a;

        int i = 0;
        int j= b.length - 1;
        while(i<j){
            int temp = b[i];
            b[i] = b[j];
            b[j] = temp;
            i++;
            j--;
        }

        System.out.println(checkArr(n,a,b));
    }
}