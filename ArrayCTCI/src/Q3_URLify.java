
public class Q3_URLify {
	public static String URLify_1(String str)
	{
		if(str.length()==0)
		{
			return "";
		}
		
		String str1 = str.trim();
		StringBuilder result = new StringBuilder();
		char[] c = str1.toCharArray();
		
		for(int i = 0; i<c.length;i++)
		{
			if(c[i] ==' ')
			{
				result.append("%20");
			}
			else
			{
				result.append(c[i]);
			}
		}
		return result.toString();
	}
	
	public static void URLify_2(char[] str, int trueLength)//misunderstood the question
	{
		int spaceCount = 0 , index;
		for(int i = 0; i<trueLength ; i++)
		{
			if(str[i] == ' ' )
			{
				spaceCount++;
			}
		}
		
		index = trueLength+spaceCount*2;
		if(trueLength<str.length) str[trueLength] = '\0';
		for(int i=trueLength-1;i>=0;i--)
		{
			if(str[i] == ' ')
			{
				str[index-1] = '0';
				str[index-2] = '2';
				str[index-3] = '%';
				index = index - 3;
			}
			else
			{
				str[index-1] = str[i];
				index--;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Mr John Smith   ";
		System.out.println(URLify_1(str));
	}

}
