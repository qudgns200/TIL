import java.util.HashMap;

public class Programmers_20191028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "1D2S#10S";
		// 10S10S10S
		// 1D2S#10S
		
		System.out.println(solution(s));
	}

	public static int solution(String dartResult) {
		int answer = 0;
		int j=0;
		int start = 0;
		int end = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<dartResult.length(); i++) {
			if(i==0) continue;
			else {
				if(Character.isDigit(dartResult.charAt(i))) {
					if(dartResult.charAt(i)=='0' && dartResult.charAt(i-1)=='1') {
						continue;
					} else {
						end = i-1;
						cal(start, end, dartResult, map, j);
						start = i;
						j++;
					}	
				}
			}
		}
		cal(start, dartResult.length()-1, dartResult, map, j);
		
		for(int i=0; i<map.size(); i++) answer = answer + map.get(i);
		
		return answer;
	}
	
	public static void cal(int start, int end, String dartResult, HashMap<Integer, Integer> map, int idx) {
		for(int i=start; i<=end; i++) {
			if(i==start) {
				if(dartResult.charAt(i)=='1' && dartResult.charAt(i+1)=='0') {
					map.put(idx, 10);
					i++;
				}
				else map.put(idx, Character.getNumericValue(dartResult.charAt(i)));
			}
			else {
				if(dartResult.charAt(i) == 'S') continue;
				else if(dartResult.charAt(i) == 'D') map.put(idx, map.get(idx) * map.get(idx));
				else if(dartResult.charAt(i) == 'T') map.put(idx, map.get(idx) * map.get(idx) * map.get(idx));
				else if(dartResult.charAt(i) == '*') {
					map.put(idx, map.get(idx) * 2);
					if(idx != 0) map.put(idx-1, map.get(idx-1) * 2);
				}
				else if(dartResult.charAt(i) == '#') map.put(idx, map.get(idx) * (-1));
			}
		}
	}
}
