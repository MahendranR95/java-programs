
import java.util.Scanner;

public class isFactorialNo {

	public static void main(String[] args) {
    	// TODO Auto-generated method stub
	Scanner in=new Scanner(System.in);
	System.out.println("Input:");
	int n=in.nextInt();
	int count=0;
	count=isFact(n);
 	System.out.println(count);
}
private static int isFact(int n) {
	// TODO Auto-generated method stub
	int c=1;
	for(;n!=0;n--){
		c=c*n;
	}		
	return c;
}

}
