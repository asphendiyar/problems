import java.util.*;
import java.lang.*;

public class A144 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];


        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        int maxin = 0;
        int minin = 0;

        for(int j = 1; j < arr.length; j++){
            if(max<arr[j]) {
                max = arr[j];
                maxin = j;
            }
            if(min>=arr[j]){
                min = arr[j];
                minin = j;
            }
        }
        int count = 0;

        if (minin > maxin)
            count = (n - minin + maxin - 1); 
        else
            count = (n - minin + maxin - 2); 

        System.out.println(count);

    }
}
