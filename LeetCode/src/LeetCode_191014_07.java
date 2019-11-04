
public class LeetCode_191014_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1534236469;
		
		String num = Integer.toString(x);
		StringBuffer sb = new StringBuffer();
		boolean chk = false;
	
		try {
			if(x==0) System.out.println("0");
			else
			{
				for(int i=num.length()-1; i>=0; i--)
				{
					if(num.charAt(i)!='-')
					{
						if(num.charAt(i)!='0')
						{
							sb.append(num.charAt(i));
							chk = true;
						}
						else
						{
							if(chk==true) sb.append(num.charAt(i));
						}
					}
				}
				int y = Integer.parseInt(sb.toString());
				
				if(x<0) y = -(y);
				System.out.println(y);
			}
		}
		catch(NumberFormatException e) {
			System.out.println("0");
		}
	}	
}
