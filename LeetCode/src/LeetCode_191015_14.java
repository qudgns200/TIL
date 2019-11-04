
public class LeetCode_191015_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"aca", "cba"};
		//"flower", "flow", "flight"
		//"dog","racecar","car"
		//"c","acc","ccc"
		String result = longestCommonPrefix(strs);
		System.out.println("prefix = " + result);
	}
	
	public static String longestCommonPrefix(String[] strs) {
		int i=0;
		String result = null;
		
		if(strs.length == 0) result = "";
		else {
			result = strs[i].toString();
			if(result.length()==0 || result.isEmpty()) result = "";
			else {
				for(i=1; i<strs.length;i++) {
					result = returnPrefix(strs[i], result);
				}
			}
		}
		return result;
	}
	
	public static String returnPrefix(String strs, String temp) {
		int i=0,j=0;
		StringBuffer sb = new StringBuffer();
		sb.setLength(0);
		while(i < temp.length() && j < strs.length()) {
			if(temp.charAt(i)==strs.charAt(j)) {
				sb.append(temp.charAt(i));
			}
			else break;
			i++; j++;
		}
		if(sb.length() == 0) sb.append("");
		
		return sb.toString();
	}
}
