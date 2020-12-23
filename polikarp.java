import java.util.*;
import java.lang.*;

public class polikarp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();


        int count = 0;
        for(int i = 0; i < t; i++){
           int n = in.nextInt();
           String s = in.next();
           String[] arr = new String[s.length()];
           for(int k = 0; k < arr.length; k++){
               arr[k] = s.charAt(k);
           }
           for(int j = 1; j < arr.length -1; j++){
                if(arr[j]== "0" && arr[j - 1] == "2"){
                    count++;
                }
           }
           if(count<2){
               System.out.println("NO");
           }
           else System.out.println("YES");
        }
    }
}
