package numberConversionProject;
import java.util.*;

public class holiday {
	public static void main(String[] arg){

		System.out.println("Input:");
		Scanner s=new Scanner(System.in);
		String  b=s.next();

		if(b.equalsIgnoreCase("sunday"))
		{
			System.out.println("Output"+"holiday");
		}
		else if(b.equalsIgnoreCase("saturday"))
		{
			System.out.println("Output"+"holiday");
		}
		else
			System.out.println("Output"+"not holiday");
	}

}




