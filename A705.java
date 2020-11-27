import java.util.Scanner;

public class A705 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        for (int i = 0; i < a; i++) {
            if (i % 2 == 0) {
                System.out.print("I hate ");
            } else {
                System.out.print("I love ");
            }
            if (i != a - 1) {
                System.out.print("that ");
            } else {
                System.out.println("it ");
            }
        }
    }
}
