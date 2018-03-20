import java.util.*;


public class oddevenstrchange {

    public static void main(String[] args) {
       System.out.print("Input:");
       Scanner ss=new Scanner(System.in);
       String  s=ss.next();
       char a[]=s.toCharArray();
       for(int i=0;i<s.length();i+=2){
          char t=a[i];
           a[i]=a[i+1];
           a[i+1]=t;

       }
      for(int i=0;i<s.length();i++){
          System.out.print(a[i]);
      }

    }
}
