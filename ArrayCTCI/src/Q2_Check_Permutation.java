import java.util.Arrays;
import java.util.HashMap;

public class Q2_Check_Permutation {

	public static boolean Check_Permutation_1(String str1,String str2)
	{
		if(str1.length()!=str2.length())
		{
			return false;
		}
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(int i=0 ; i<str1.length(); i++)
		{
			char key = str1.charAt(i);
			
			if(map.containsKey(key))
			{
				map.put(key,map.get(key)-1);
			}
			else
			{
				map.put(key,0);
			}
		}
		
		for(int i = 0 ; i < str2.length(); i++)
		{
			char key = str2.charAt(i);
			if(map.containsKey(key))
			{
				if(map.get(key)<=0)
				{
					map.put(key,map.get(key)+1);
				}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		return true;
	}
	
	public static boolean Check_Permutation_2(String str1,String str2)//suggested solution in book
	{
		if(str1.length()!=str2.length())
		{
			return false;
		}
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();
		Arrays.sort(c1);//Arrays.sort() for primitive type uses quick sort O(n*log(n)) might go to quadratic; for Object type uses merge sort O(n*log(n))
		Arrays.sort(c2);
		
		return new String(c1).equals(new String(c2));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abcd   ";
		String str2 = "bca   ";
		System.out.println(Check_Permutation_1(str1,str2));
		System.out.println(Check_Permutation_2(str1,str2));
		
	}

}
