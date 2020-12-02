import java.util.Arrays;
import java.util.Scanner;
public class A469
{
	public static void main(String[] args)
	{
		Scanner z=new Scanner(System.in);
		int n=z.nextInt();
		int x=z.nextInt();
		int[] x1=new int[x];
		for(int i=0;i<x;i++)
			x1[i]=z.nextInt();
		int y=z.nextInt();
		int[] y1=new int[y];
		for(int i=0;i<y;i++)
			y1[i]=z.nextInt();
		int p=0,q=0;
		for(int j=1;j<=n;j++)
		{
			if(Arrays.toString(x1).contains(String.valueOf(j)))
			{
				p++;
				continue;
			}
			if(Arrays.toString(y1).contains(String.valueOf(j)))
			{
				q++;
				continue;
			}
		}
		if(n==p+q)
			System.out.println("I become the guy.");
		else
			System.out.println("Oh, my keyboard!");
	}
}