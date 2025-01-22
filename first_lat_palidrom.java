package string_ex;

public class first_lat_palidrom {
	public static void main(String[] args)
	{
		System.out.print(ispali("madim"));
	}
	static boolean ispali(String s)
	{
		
		int i=0, j=s.length();
		
		while (i<j)
		{
			if(s.charAt(0)!=s.charAt(4))  return false;
				i++;
				j--;
			
			
			}
		return true;
		
		}
	}


