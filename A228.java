import java.util.*;
import java.lang.*;

public class A228 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[4];

        
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);
        int count = 0;

        for(int j = 1; j <= arr.length - 1; j++){
            if(arr[j] == arr[j - 1]){
                count++;
            }
        }

        System.out.println(count);
    }
}
