package string_ex;

public class string_rev {
 public static void main(String[] args) {
	String st="aishu";
	String rev=" ";
	char[] ch=st.toCharArray();
	for(int i=ch.length-1;i>=0;i--) {
		rev+=ch[i];
	}
	System.out.print(rev);
}
}
