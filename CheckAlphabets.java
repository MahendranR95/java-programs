import java.util.Scanner;

public class CheckAlphabets {
public static void main(String[] args) {
	String b;
	Scanner in=new Scanner(System.in);
	b=in.next();
	char a=b.charAt(0);
	if((a>='a'&&a<='z')||(a>='A'&&a<='Z'))
	{
		System.out.println("Alphabets");
	}
	else
		System.out.println("No");
}
}
