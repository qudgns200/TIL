public class Programmers_20191101_02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "sp ace";

		System.out.println(solution(s));
	}

	public static String solution(String s) {
		String answer = "";
		char[] s_char = s.toCharArray();

		int idx = 0;
		for (int i = 0; i < s_char.length; i++) {
			if (s_char[i] == ' ')
				idx = 0;
			else if (idx == 0 || idx % 2 == 0) {
				s_char[i] = Character.toUpperCase(s_char[i]);
				idx++;
			} else {
				s_char[i] = Character.toLowerCase(s_char[i]);
				idx++;
			}
		}
		answer = String.valueOf(s_char);
		return answer;
	}
}
