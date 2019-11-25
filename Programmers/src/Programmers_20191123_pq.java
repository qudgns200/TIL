import java.util.PriorityQueue;

public class Programmers_20191123_pq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		
		System.out.println(solution(scoville, K));
	}
	
	public static int solution(int[] scoville, int K) {
		int answer = 0;
        int n1=0, n2=0; // ���ں� ���� ����� ���� ����

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        // �켱���� ť�� �迭 ������ ����
        for(int i=0; i<scoville.length; i++) {
        	pq.offer(scoville[i]);
        }
        
        // �켱���� ť�� ó�� �����͸� peek �Ͽ��� ��(���� ���� ��)
        // 1. ���ں� �������� ���ų� ũ�� while���� �������ͼ� ����
        // 2. �ƴ� ��� poll�� �� ���Ͽ� ���ں� ������ ����Ͽ� �ٽ� �켱���� ť�� ����
        while(pq.size() > 1) {
        	if(pq.peek() >= K) break;
        	
        	n1 = pq.poll();
        	n2 = pq.poll();
        	
        	pq.offer(n1 + (n2*2));
        	
        	answer++;
        }
        
        // �켱���� ť�� ����� 1�� ��
        // ���ں� �������� ������ -1�� ����
        if(pq.peek()<K) answer = -1;
        
        return answer;
    }

}
