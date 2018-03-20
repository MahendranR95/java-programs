import java.util.Scanner;
public class EvenNoBetweenRange {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Input :");
		int s=in.nextInt();
		int e=in.nextInt();
		for(int j=s+1;j<e;j++)
		{
			if(j%2==0)
				{
					System.out.println(j);
				}			
		}
		
	}
}
