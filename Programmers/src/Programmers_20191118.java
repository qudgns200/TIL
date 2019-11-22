import java.util.Arrays;

public class Programmers_20191118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution so = new Solution();
		
		int[] people = {70, 50, 80};
		int limit = 100;
		
		System.out.println(so.solution(people, limit));
	}

}

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        // 최소값을 가지고 최대값을 비교하여
        // limit가 넘을 경우 최대값은 무조건 보트를 혼자 타야함
        // 넘지 않을 경우는 최소값과 최대값 둘이 보트를 탐
        // 넘지 않을 경우에만 최소값의 인덱스를 하나씩 증가 시킴
        Arrays.sort(people);
        int i,j=0;
        for(i=people.length-1; i>j; i--) {
        	if(people[i] + people[j] <= limit) j++;
        	answer++;
        }
        
        if(i==j) answer++;

        return answer;
    }
}
