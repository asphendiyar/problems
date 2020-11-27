import java.util.Scanner;

public class A1030 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        int count = 0;

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
            if(arr[i] == 1){
                count++;
            }
        }

        if(count != 0){
            System.out.println("HARD");
        }
        else System.out.println("EASY");
    } 
}
