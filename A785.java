import java.util.*;
import java.lang.*;

public class A785 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int res = 0;

        for(int i = 0; i < n; i++){
            String s = in.next();
            if (s.equals("Tetrahedron")) res += 4;
            else if (s.equals("Cube")) res += 6;
            else if (s.equals("Octahedron")) res += 8;
            else if (s.equals("Dodecahedron")) res += 12;
            else if (s.equals("Icosahedron")) res += 20;
           
        }

        System.out.println(res);
    }
}
