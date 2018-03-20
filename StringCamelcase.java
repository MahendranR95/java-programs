import java.io.*;
import java.util.*;
public class StringCamelcase
{
	public static void main(String a[]) throws Exception
	{
         Scanner input = new Scanner(System.in);	
	 System.out.println("Input:"); 	
	 String s; 	 
	 s=input.nextLine();	
	 
	//write your logic here 
	 char ch[]=s.toCharArray();
	   
	   for(int i=0;i<ch.length;i++)
	   {
			   if (i==0&&ch[i]!=' '||ch[i]!=' '&& ch[i-1]==' ')
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



        //end 	
	
     System.out.println("Output:\n"+ st);
        }
}

