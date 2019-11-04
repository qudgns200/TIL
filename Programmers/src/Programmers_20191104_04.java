
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
        
        // return 할 데이터 저장
        // 전체 인원 수에서 체육복을 잃어버린 학생의 수를 뺄셈하여
        // 현재 체육 수업을 들을 수 있는 학생의 수로 설정
        answer = n-lost.length;
        
        // 체육복 분실한 학생과 여분의 체육복을 갖고 있는 학생의 중복 제거를 위한 for문
        // 중복 일 시 value를 -1로 변경
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
        
        // 잃어버린 학생의 번호가 -1이 아니고
        // 앞뒤로 비교하여 여분의 체육복을 가진 학생이 있을 경우
        // 체육 수업이 가능한 학생의 인원수를 증가
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
