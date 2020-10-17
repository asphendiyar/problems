import java.util.*;
import java.lang.*;

class fence{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int h = in.nextInt();
        int[] arr = new int[n];

        int result = 0;
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
            if(arr[i] > h) result+=2;
            else if(arr[i] <= h) result++;
        }

        System.out.println(result);


    }
}