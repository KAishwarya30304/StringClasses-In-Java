package string_ex;
import java.util.*;
public class exceting_String 
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a value");
		String s1 =s.next();
		String s2 = " ";
	        while(s1.length()>0) {
	        	char c=s1.charAt(0);
	        	s2=s1.replace(c+"", "");
	        	int count=s1.length()-s2.length();
	        	System.out.println(c+"="+count);
	        s1=s2;

		}
	}
}

