import java.util.*;
import java.lang.*;

public class A510{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        boolean dot = true;
        for(int i = 0; i < n; i++){
            if(i%2 == 0){
                for(int j = 0; j < m; j++){
                    System.out.print("#");
                }
                System.out.println();
                continue;
            }
            if(i%2==1 && dot == true){
                for(int k = 0; k < m - 1; k++){
                    System.out.print(".");
                }
                System.out.print("#");
                dot = false;
                System.out.println();
                continue;
            }
            if(i%2==1 && dot == false){
                System.out.print("#");
                for(int k = 0; k < m - 1; k++){
                    System.out.print(".");
                }
                System.out.println();
                dot = true;
                continue;
            }
        }
    }
}