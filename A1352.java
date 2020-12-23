import java.util.*;
import java.lang.*;

public class A1352 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();


        int count = 0;

        for(int i = 0; i < t; i++){
           int n = in.nextInt();
           String s = in.next();
           
           int l = s.length() - 1;

           while(s.charAt(l) == ')'){
               count++;
               l--;
               if(l<0){
                   break;
               }
           }

           if(n - count < count){
               System.out.println("YES" + count);
           }
           else System.out.println("NO");
        }
    }
}
