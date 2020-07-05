import java.util.ArrayList;
import java.util.HashMap;

public class Problem_200705_4673 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Character> map = new HashMap<Integer, Character>(); // 생성자 여부 체크
		ArrayList<Integer> result = new ArrayList<Integer>(); // 결과 출력용 list
		
		/*
		 * 1부터 10000까지 루프를 돌며 생성자 일 시 map에 Y를 저장하여 표기
		 * 셀프 넘버 일 시 list에 저장
		 */
		for (int i = 1; i <= 10000; i++) {
			int n = 0;

			Character isY = map.get(i); // 셀프 넘버 여부 확인
			if (isY == null) {
				result.add(i);
			}
			n = i;
			n = n + sumDigits(n);
			map.put(n, 'Y');
		}
		for(int resultNumber : result) {
			System.out.println(resultNumber);
		}
	}
	
	// 자리수 계산
	public static int sumDigits(int n) {
		int sum = 0;
		while(n != 0) { // 루프 돌며 10으로 계속 나누어 나머지를 계산
			sum += n%10;
			n /= 10;
		}
		return sum;
	}
}
