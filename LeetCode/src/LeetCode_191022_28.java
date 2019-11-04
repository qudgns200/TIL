
public class LeetCode_191022_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack = "aaaaa";
		String needle = "";
		
		System.out.println(strStr(haystack, needle));
	}
	
    public static int strStr(String haystack, String needle) {
        int idx = haystack.indexOf(needle);
        return idx;
    }

}
