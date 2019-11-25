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

        // scoville를 오름차순 정렬하여
        // 0번과 1번으로 스코빌 지수를 구하고
        // 이를 임시 배열에 저장하여
        // 다시 scoville 배열로 복사
        while(true) {
        	int n = scoville.length;
        	boolean isSmall = true; // 스코빌 지수보다 낮은 데이터가 있는지 확인하는 boolean 변수
        	
        	// 배열의 길이가 1일 경우 스코빌 지수를 비교하여 작을 경우 -1을 리턴
        	if(n==1) {
        		if(scoville[0] < K) {
        			answer = -1;
        			break;
        		}
        	}
        	
        	Arrays.sort(scoville);
        	
        	// 현재 배열의 데이터들이 스코빌 지수보다 작은 것이 있을 경우
        	// 다음 수행 작업을 위해 break;
        	for(int i=0; i<scoville.length; i++) {
        		if(scoville[i] < K) {
        			isSmall = false;
        			break;
        		}
        	}
        	
        	// isSmall이 true 일 경우는
        	// 모든 데이터들이 스코빌 지수보다 높다는 것을 의미하므로
        	// while문을 빠져나와서 리턴
        	if(isSmall==true) break;
        	
        	// 0번, 1번을 계산하여 스코빌 지수를 구하고
        	// 이를 임시 배열을 활용하여
        	// scoville 배열에 다시 copy하는 과정
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
