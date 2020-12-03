import java.util.*;
import java.lang.*;
public class A520 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();

        int count = 0;

        for(char i = 'a'; i <= 'z'; i++){
            if(s.toLowerCase().contains(String.valueOf(i))){
                count++;
            }
        } 

        if(count == 26) System.out.println("YES");
        else System.out.println("NO");

    }
}




