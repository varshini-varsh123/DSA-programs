import java.util.*;
import java.lang.*;
 
public class Main
{
 
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			String str = sc.next();
			int n =str.length();
			if(n>10) {
				System.out.println(str.charAt(0)+""+(n-2)+""+str.charAt(n-1));
			}
			else
			System.out.println(str);
		}
	}
}
