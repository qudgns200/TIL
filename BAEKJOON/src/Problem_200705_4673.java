import java.util.ArrayList;
import java.util.HashMap;

public class Problem_200705_4673 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Character> map = new HashMap<Integer, Character>(); // ������ ���� üũ
		ArrayList<Integer> result = new ArrayList<Integer>(); // ��� ��¿� list
		
		/*
		 * 1���� 10000���� ������ ���� ������ �� �� map�� Y�� �����Ͽ� ǥ��
		 * ���� �ѹ� �� �� list�� ����
		 */
		for (int i = 1; i <= 10000; i++) {
			int n = 0;

			Character isY = map.get(i); // ���� �ѹ� ���� Ȯ��
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
	
	// �ڸ��� ���
	public static int sumDigits(int n) {
		int sum = 0;
		while(n != 0) { // ���� ���� 10���� ��� ������ �������� ���
			sum += n%10;
			n /= 10;
		}
		return sum;
	}
}
