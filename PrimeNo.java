import java.util.Scanner;
public class PrimeNo {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Input :");
		int T=in.nextInt();
		int c=0;
		if(T<=1000)
		{
			int i=1;
			while(i<=T)
			{
				if(T%i==0)
				{
					c++;
				}
				i++;
			}
		}
		String b=(c==2)?"yes":"No";	
		System.out.println(b);
	}
}
