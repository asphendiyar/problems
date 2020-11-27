import java.util.Scanner;

public class A486 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n = in.nextLong();
        long a = 0;

        if(n % 2 == 0) a = n / 2;
        else a = (n - 1) / 2 -  n;
        

        System.out.println(a);


    }
}
