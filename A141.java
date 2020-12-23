import java.util.*;
import java.lang.*;

public class A141 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String x = in.next();
        String y = in.next();
        String z = in.next();

        String yo = x + y;

        char[] xy = yo.toCharArray();
        char[] zz = z.toCharArray();

        Arrays.sort(xy);
        Arrays.sort(zz);
        
        
        
        if(Arrays.equals(xy, zz)){
            System.out.println("YES");
        }else System.out.println("NO");
        

        


        
    }
}
