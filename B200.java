import java.util.Scanner;
import java.lang.*;

public class B200 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        double total = 0;
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
            total+=arr[i];
        }

        System.out.println(total/n ); 

    }
}
