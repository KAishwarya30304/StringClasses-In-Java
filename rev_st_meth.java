package string_ex;
public class rev_st_meth {
	public static void main(String[] args) {
		System.out.print(rev("aishwarya"));
	}
public static String rev(String s) {
	String s2="";
	for(int i=s.length()-1;i>=0;i--) {
		s2+=s.charAt(i);
	}
	return s2;
	
}
	
}


