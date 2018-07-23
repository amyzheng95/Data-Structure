import java.util.HashMap;

public class Q4_Palindrome_Permutation {
	public static boolean pp_1(String str)
	{
		HashMap<Character,Integer> map = new HashMap<>();
		int spaceCount = 0;
		
		for(int i = 0 ; i < str.length();i++)
		{
			char c = Character.toLowerCase(str.charAt(i));
			if(c == ' ')
			{
				spaceCount++;
			}
			else
			{
				if(map.containsKey(c))
				{
					map.put(c, map.get(c)+1);
				}
				else
				{
					map.put(c, 1);
				}
			}
			
		}
		
		for(int c:map.values())
		{
			if(c%2!=0)
			{
				spaceCount--;
				if(spaceCount<-1)
				{
					return false;
				}
			}
			
		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c =  ' ';
		Character.toLowerCase(c);
		String str = "aa  a";
		System.out.println(pp_1(str));
	}

}
