import java.util.Scanner;
public class ReverseString {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Input :");
		String s=in.nextLine();
		if(s.length()>0&&s.length()<=100000)
		{
			for(int i=s.length()-1;i>=0;i--)
			{
				System.out.print(s.charAt(i));
			}
		}
	}
}
