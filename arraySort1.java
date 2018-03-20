import java.util.Arrays;
import java.util.Scanner;

public class arraySort1 {
public static void main(String[] args) {
	int n;
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
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
	int co=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			if(i!=j)
			{
			
				if(a[i] != a[j])
                {
                    co= 1;
                   
                }
                else
                {
                    co = 0;
                    break;
                }
			}	
	}
		 
		if(co == 1)
         {
             System.out.print(a[i]+" ");
         }
	
	}
	
}
}
