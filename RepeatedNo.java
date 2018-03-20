import java.util.Arrays;
import java.util.Scanner;

public class RepeatedNo {
public static void main(String[] args) {
	int n;
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=in.nextInt();
	}
  Arrays.sort(a);
	int co=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				System.out.println(a[i]);
				co=1;
			}
		}		
	}
	if(co==0)
		System.out.println("unique");
	
}
}
