import java.util.*;
import java.lang.*;

public class magnets {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];
        int result = 1;

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        for(int j = 1; j <=n - 1; j++){
            if(arr[j] != arr[j - 1]){
                result++;
            }
        }

        System.out.println(result);

    }
}
