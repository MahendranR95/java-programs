import java.util.Scanner;
public class PowofValue {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Input :");
		int N=in.nextInt();
		int K=in.nextInt();
		int c=1;
		while(K>0){
			c=c*N;
			K--;
		}		
		System.out.println("Output :");
		System.out.println(c);		
	}
}
