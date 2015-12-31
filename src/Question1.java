import java.io.*;
import java.util.*;



@SuppressWarnings("unused")
public class Question1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        int t1;
        t1 = in.nextInt();
        int[] N = new int[t1];
        for(int i=0;i<t1;i++){
            N[i]=in.nextInt();
        }
        
        for(int i=0;i<t1;i++){
            int sum = 0;
            for(int j= 1; j <N[i];j++){
                if((j % 3 == 0) || (j %5 ==0)){
                    sum += j;
                }
            }
            System.out.println(sum);
        }
    }
}