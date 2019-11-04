
public class Programmers_20191104_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int[] lost = {1,2};
		int[] reserve = {2,3};
		System.out.println(solution(n, lost, reserve));
	}
	
	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        // return �� ������ ����
        // ��ü �ο� ������ ü������ �Ҿ���� �л��� ���� �����Ͽ�
        // ���� ü�� ������ ���� �� �ִ� �л��� ���� ����
        answer = n-lost.length;
        
        // ü���� �н��� �л��� ������ ü������ ���� �ִ� �л��� �ߺ� ���Ÿ� ���� for��
        // �ߺ� �� �� value�� -1�� ����
        for(int i=0; i<lost.length; i++) {
        	for(int j=0; j<reserve.length;j++) {
        		if(lost[i]==reserve[j]) {
        			lost[i] = -1;
        			reserve[j] = -1;
        			answer++;
        			break;
        		}
        	}
        }
        
        // �Ҿ���� �л��� ��ȣ�� -1�� �ƴϰ�
        // �յڷ� ���Ͽ� ������ ü������ ���� �л��� ���� ���
        // ü�� ������ ������ �л��� �ο����� ����
        for(int i=0; i<lost.length; i++) {
        	for(int j=0; j<reserve.length; j++) {   		
        		if(lost[i]!=-1 && (reserve[j] == lost[i]-1 || reserve[j] == lost[i]+1)) {
        			reserve[j] = -1;
        			answer++;
        			break;
        		}
        	}
        }
        return answer;
    }
}
