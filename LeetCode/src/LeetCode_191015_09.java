
public class LeetCode_191015_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1221;
		String s = Integer.toString(x);
		int i=0, j=s.length()-1;
		
		boolean ret = true;
		
		while(i<j) {
			if(s.charAt(i) != s.charAt(j)) {
				ret = false;
				break;
			}
			i++;
			j--;
		}
		System.out.println(ret);
	}

}
