
public class LeetCode_191013_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lengthOfLongestSubstring=0;
		String s = "au";
		//abcabcbb
		//pwwkew
		//au
		StringBuffer a = new StringBuffer();
		StringBuffer b = new StringBuffer();
		
		boolean chk = true;
		
		int idx=0;
		
		if(s.length() == 0) System.out.println("0");
		else if(s.charAt(0) == ' ') System.out.println("1");
		else
		{
			while(idx!=s.length())
			{
				if(idx==0 || b.length()==0) 
				{
					b.append(s.charAt(idx));
					lengthOfLongestSubstring = b.length();
				}
				else
				{
					for(int i=0; i<b.length(); i++)
					{
						if(b.charAt(i)!=s.charAt(idx)) chk=false;
						else if(b.charAt(i)==s.charAt(idx))
						{
							if(a.length()==0) a.append(b.toString());
							else if(a.length() < b.length())
							{
								a.setLength(0);
								a.append(b.toString());
								lengthOfLongestSubstring = a.length();
							}
							b.setLength(0);
							b.append(s.charAt(idx));
							chk = true;
							break;
						}
					}
					if(chk==false) 
					{
						b.append(s.charAt(idx));
						lengthOfLongestSubstring = b.length();
					}
				}
				idx++;
			}
			System.out.println("a = " + a);
			System.out.println("lengthOfLongestSubstring = " + lengthOfLongestSubstring);
		}
	}
}
