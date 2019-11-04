
public class LeetCode_191023_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaabaaaa";

		System.out.println(longestPalindrome(s));
	}

	public static String longestPalindrome(String s) {
		if(s.length() < 2) return s;
		
		int start=0, end=0;
		
		for(int i=0; i<s.length(); i++) {
			int len1 = searhArray(s, i, i);
			int len2 = searhArray(s, i, i+1);
			
			int maxLen = Math.max(len1, len2);
			
			if(maxLen > (end-start+1)) {
				if(maxLen == len1) {
					start = i-(maxLen/2);
				} else {
					start = i-(maxLen/2) + 1;
				}
				end = start + maxLen-1;
			}
		}
		return s.substring(start, end+1);
	}

	public static int searhArray(String s, int left, int right) {
		int l = left;
		int r = right;
		int tmp = 0;
		
		while(l >=0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
			tmp = r - l + 1;
			l--;
			r++;
		}
		return tmp;
	}
}
