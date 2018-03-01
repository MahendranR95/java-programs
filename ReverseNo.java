import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Input :");
		int T=in.nextInt();
		int c=0;
		int N=T;
			while(N!=0)
			{
				int n=N%10;
				c=n+c*10;
				N=N/10;
			}
      System.out.println(c);	
	}
}
