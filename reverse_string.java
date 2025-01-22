package string_ex;
public class reverse_string {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello World");
		 sb=sb.reverse();
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.indexOf("o"));
		System.out.println(sb.indexOf("o",2));
		System.out.println(sb.lastIndexOf("o"));
		
	}

}
