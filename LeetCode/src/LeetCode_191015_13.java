
public class LeetCode_191015_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "III";
		//MDCXCV
		//MCMXCIV
		//III
		int j=0, sum = 0;
		int[] temp = new int[s.length()];
		
		for(int i=0; i<s.length(); i++) {
			temp[i] = chgRoman(s.charAt(i));
		}
		
		while(j<=s.length()-1) {
			if(s.length() == 1) {
				sum = chgRoman(s.charAt(j));
				break;
			}
			else if(j==s.length()-1 || temp[j] >= temp[j+1]) {
				sum = sum + temp[j];
				j++;
			}
			else {
				sum = sum + (temp[j+1]-temp[j]);
				j=j+2;				
			}
		}
		System.out.println(sum);
	}
	
	public static int chgRoman(char roman) {
		switch (roman) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
		}
	}

}
