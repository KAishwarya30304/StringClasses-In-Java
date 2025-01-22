package string_ex;
public class rev_str {
	public static void main(String[] args) {
		String strg="aishu";
		String s="";
		for (int i= strg.length()-1; i >=0; i--) 
		{
			s+=strg.charAt(i);
        }
		System.out.print(s);
	}

}
