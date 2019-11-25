import java.util.Arrays;

public class Programmers_20191123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		
		System.out.println(solution(scoville, K));
	}
	
	public static int solution(int[] scoville, int K) {
        int answer = 0;

        // scoville�� �������� �����Ͽ�
        // 0���� 1������ ���ں� ������ ���ϰ�
        // �̸� �ӽ� �迭�� �����Ͽ�
        // �ٽ� scoville �迭�� ����
        while(true) {
        	int n = scoville.length;
        	boolean isSmall = true; // ���ں� �������� ���� �����Ͱ� �ִ��� Ȯ���ϴ� boolean ����
        	
        	// �迭�� ���̰� 1�� ��� ���ں� ������ ���Ͽ� ���� ��� -1�� ����
        	if(n==1) {
        		if(scoville[0] < K) {
        			answer = -1;
        			break;
        		}
        	}
        	
        	Arrays.sort(scoville);
        	
        	// ���� �迭�� �����͵��� ���ں� �������� ���� ���� ���� ���
        	// ���� ���� �۾��� ���� break;
        	for(int i=0; i<scoville.length; i++) {
        		if(scoville[i] < K) {
        			isSmall = false;
        			break;
        		}
        	}
        	
        	// isSmall�� true �� ����
        	// ��� �����͵��� ���ں� �������� ���ٴ� ���� �ǹ��ϹǷ�
        	// while���� �������ͼ� ����
        	if(isSmall==true) break;
        	
        	// 0��, 1���� ����Ͽ� ���ں� ������ ���ϰ�
        	// �̸� �ӽ� �迭�� Ȱ���Ͽ�
        	// scoville �迭�� �ٽ� copy�ϴ� ����
        	int newScoville = scoville[0] + (scoville[1]*2);
        	int[] tempArr = new int[n-1];
        	tempArr[0] = newScoville;
        	for(int i=2; i<scoville.length; i++) {
        		tempArr[i-1] = scoville[i];
        	}
        	scoville = null;
        	scoville = new int[tempArr.length];
        	
        	scoville = Arrays.copyOf(tempArr, tempArr.length);
        	
        	answer++;
        }
        
        return answer;
    }

}
