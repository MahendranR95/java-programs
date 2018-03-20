
import java.util.Scanner;

public class Stringreversecap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner in = new Scanner(System.in);
	      System.out.print("Input: ");
	      String sentence = in.nextLine();
	      String s= initcap(sentence);
	      System.out.println("Output: " +s);
	      
	}
	public static String initcap(String str)
    {
	  char ch[]=str.toCharArray();
	  for(int i=0;i<ch.length;i++)
	   {
		    if ((i==ch.length-1&&ch[i]!=' ')||(ch[i]!=' '&& ch[i+1]==' '))
			   {
				   if(ch[i]>='a'&&ch[i]<='z')
				   {
					   ch[i]=(char) (ch[i]-32);
				   }
			   }
				   else
				   {
					   if(ch[i]>='A'&&ch[i]<='Z')
					   ch[i]=(char)(ch[i]+32);
				   }
			   
	   }
	     String st="";
	    st=new String(ch);
      return st;
  }
}
