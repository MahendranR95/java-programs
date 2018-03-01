import java.util.Scanner;
public class PrimeNo {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Input :");
		int T=in.nextInt();
		int c=0;
		if(T<=1000)
		{
			for(int i=1;i<=T;i++)
			{
				if(T%i==0)
				{
					c++;
				}
			}
		}
		String b=(c==2)?"yes":"No";	
		System.out.println(b);
	}
}
