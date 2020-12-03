import java.util.*;
import java.lang.*;
public class A443 {
    public static void main(String[] args) {
        Scanner zz=new Scanner(System.in);
		String x=zz.nextLine();
        String y=x.replace("{", "").replace("}", "").replaceFirst(",", "").replaceAll("\\s","");
        
        
        int count = 0;

        for(char ch = 'a'; ch <= 'z'; ch++){
            if(y.contains(String.valueOf(ch))){
                count++;
            }
        }
        System.out.println(count);
    }
}