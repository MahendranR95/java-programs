
import java.util.Arrays;
import java.util.Scanner;

public class reversearrayno {
public static void main(String[] args) {
	int n;
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	if(n>=1&&n<=100000)
	{
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=in.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(a[i]>a[j])
			{
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
			
		}		
	}
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.println(a[i]);
	}
	
	}}
}
