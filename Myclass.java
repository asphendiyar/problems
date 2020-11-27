import java.util.*;
import java.lang.*;
public class Myclass {
    public static void main(String args[]) {

      Scanner input = new Scanner(System.in);
      int count = 0;
      
      int t = input.nextInt();
      for(int i = 0; i < t; i++){
          int s = input.nextInt();
          int n = input.nextInt();
          String temp = Integer.toString(n);
          int[] newGuess = new int[temp.length()];
          for (int j = 0; j < temp.length() - 1; j++)
          {
              newGuess[j] = temp.charAt(j) - '0';
          }

          for(int k = 0; k < newGuess.length - 1; k++){
            if(newGuess[k] == 1  && newGuess[k + 1] == 1) count++;
            }
          System.out.println(count);
      }
    }
}