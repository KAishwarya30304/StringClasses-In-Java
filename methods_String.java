package string_ex;
import java.util.Scanner;
public class methods_String {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a value for string s:");
		String s =scanner.next();
		System.out.println("this is SubString of "+s+s.substring(5,9));
		System.out.println("this is SubString of "+s+s.substring());
		System.out.println(s.toLowerCase());
		System.out.println(s.substring(5));
		String s1=s.replace("A","");
		char[] m=s.toCharArray();
		char[] n=s1.toCharArray();
		for(int i=0;i<=m.length-1;i++) {
			for(int j=0;j<=n.length-1;j++) {
				
				if(m[i]!=n[j]) {
					System.out.print(m[i]);
				}else {
					System.out.print("s and s1 are same");
				}
			}
		}
		
	}

}
