import java.util.Scanner;
import java.lang.*;
public class A61 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String zz = in.next();
        String xx = in.next();

        String res = "";

        for(int i = 0; i < xx.length() ; i++){
            if(zz.charAt(i) != xx.charAt(i)){
                System.out.print("1");
            }
            else System.out.print("0");
        }
    }
}
