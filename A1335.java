import java.util.*;
import java.lang.*;

public class A1335 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            int a = in.nextInt();
            if(a%2 == 0) System.out.println(a/2 - 1);
            else System.out.println(a/2);
        }
    }
}
