import java.util.Scanner;

import java.util.*;
import java.lang.*;

public class A268{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n*2];

        int count = 0;

        for(int i = 0; i < n * 2; i++){
            arr[i] = in.nextInt();
        }


        for(int j = 0; j < arr.length; j+=2){
            for(int k = 1; k < arr.length; k+=2){
                if(arr[j] == arr[k]){
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}