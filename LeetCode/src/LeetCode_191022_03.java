import java.util.ArrayList;

public class LeetCode_191022_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "pwwkew";
		
		System.out.println(lengthOfLongestSubstring(s));
	}
	
    public static int lengthOfLongestSubstring(String s) {
    	String result;
    	int temp=0;
    	for(int i=0; i<s.length(); i++) {
    		 result = saveString(s, i);
    		 if(result.length() > temp) temp = result.length();
    	}
    	return temp;
    }
    
    public static String saveString(String str, int start) {
    	ArrayList<Character> arr = new ArrayList<Character>();
    	StringBuffer sb = new StringBuffer();
    	arr.add(str.charAt(start));
    	for(int i=start+1; i<str.length(); i++) {
    		if(str.charAt(i) != str.charAt(start)) {
    			if(!arr.contains(str.charAt(i))) {
    				arr.add(str.charAt(i));
    			} else break;
    		} else break;
    	}
    	for (Character character : arr) {
			sb.append(character);
		}
    	System.out.println(sb.toString());
    	return sb.toString();
    }

}
