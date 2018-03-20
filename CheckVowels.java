import java.util.Scanner;

public class CheckVowels {
public static void main(String[] args) {
	String b;
	Scanner in=new Scanner(System.in);
	b=in.next();
	char a=b.charAt(0);
	if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
	{
		System.out.println("Vowels");
	}
	else
		System.out.println("Consonants");
}
}
