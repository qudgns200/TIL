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
        int n1=0, n2=0; // 스코빌 지수 계산을 위한 변수

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        // 우선순위 큐에 배열 데이터 저장
        for(int i=0; i<scoville.length; i++) {
        	pq.offer(scoville[i]);
        }
        
        // 우선순위 큐의 처음 데이터를 peek 하였을 시(가장 작은 값)
        // 1. 스코빌 지수보다 같거나 크면 while문을 빠져나와서 리턴
        // 2. 아닐 경우 poll을 두 번하여 스코빌 지수를 계산하여 다시 우선순위 큐에 대입
        while(pq.size() > 1) {
        	if(pq.peek() >= K) break;
        	
        	n1 = pq.poll();
        	n2 = pq.poll();
        	
        	pq.offer(n1 + (n2*2));
        	
        	answer++;
        }
        
        // 우선순위 큐의 사이즈가 1일 때
        // 스코빌 지수보다 작으면 -1을 리턴
        if(pq.peek()<K) answer = -1;
        
        return answer;
    }

}
