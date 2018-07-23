public class Q1_isUnique {
	
	public static boolean Q1_isUnique(String str)
	{
		
		     int check=0;
		     
		     for(int i=0; i<str.length();i++)
		     {
		         int val = str.charAt(i)-'a';
		         
		         if((check & (1 << val)) >0)
		         {
		             return false;
		         }
		         
		         check |= (1<<val);
		         
		         System.out.println("check " + Integer.toBinaryString(check));
		     }
		     return true;
		/*
		int result = 0;
		
		for(int i = 0 ; i < s.length();i++ )
		{
			int temp = s.charAt(i)-'a';
			result = result^temp;
			System.out.println(result);
		}
		
		return result;
		*/
	}
	
	
	
	public static void main(String args[])
	{
		String s = "aaa";
		System.out.println(Q1_isUnique(s));
	}
}
