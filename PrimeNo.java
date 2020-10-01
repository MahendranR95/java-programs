import java.util.Scanner;
public class PrimeNo {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Input a number:");
		int T=in.nextInt();
		int c=0;
		for(int i=2; i<T/2; i++){
            		if (T % i == 0){
                		c++;
            		}
        	}
		String b=(c==0)?"yes":"No";	
		System.out.println(b);
	}
}
