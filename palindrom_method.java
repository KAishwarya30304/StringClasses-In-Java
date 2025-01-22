package string_ex;
import java.util.Scanner;
public class palindrom_method {
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	String str=scanner.nextLine();
	System.out.print(palin(str));
}
public static boolean palin(String s) {
	String string="";
	for(int i=s.length()-1;i>=0;i--) {
		string+=s.charAt(i);
	}
	if (string.equals(s)) {
        return true; 
    } else {
        return false; 
    }
}
}