import java.util.Arrays;

public class Programmers_20191112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bridge_length = 100;
		int weight = 100;
		int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};

		System.out.println(solution(bridge_length, weight, truck_weights));

	}

	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		int index = 0;
		int sum = 0;

		// Bridge ũ�⸸ŭ �迭 ���� �� 0���� �迭 ä��
		int[] arr = new int[bridge_length];
		Arrays.fill(arr, 0);

		// Ʈ���� �� ������ ������ while���� ����
		// ������ ���� 0�� ���� 0��° �ٸ� �迭�� index�� Ʈ�� ���Ը� �����ϰ� index �� answer(�ð� ��)�� ����
		// ������ ���� 0�� �ƴ� ���� �ٸ� �迭�� ������ ���� üũ�Ͽ� 0�� �ƴ� ��쿡�� �հ迡�� �׸�ŭ ���ְ�
		// for���� ���� �ٸ� �迭�� Ʈ������ �� ĭ�� �̵� ��Ŵ
		// �׸��� ���� Ʈ������ ���Ը� ����Ͽ� �ٸ� �迭�� ù��°�� �̵� ��ų �� �����ϰ�
		// answer�� ������Ŵ
		while (index != truck_weights.length) {
			if (sum == 0) {
				arr[0] = truck_weights[index];
				sum += truck_weights[index];
				index++;
				answer++;
			} else {
				if (arr[arr.length - 1] != 0) {
					sum -= arr[arr.length - 1];
				}
				
				for (int i = arr.length - 2; i >= 0; i--) {
					arr[i + 1] = arr[i];
					arr[i] = 0;
				}

				if (sum + truck_weights[index] <= weight) {
					arr[0] = truck_weights[index];
					sum += truck_weights[index];
					index++;
				}
				answer++;
			}
		}
		
		// �ٸ� �迭�� �����ִ� �� �� ���� ���� �ִ� ���� ��ġ�� ã��
		// �ٸ� ���̿��� �ش� ��ġ�� ���� �ð��� ���
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				answer += bridge_length - i;
				break;
			}
		}
		return answer;
	}

}
