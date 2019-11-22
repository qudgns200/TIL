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
        
        // �ּҰ��� ������ �ִ밪�� ���Ͽ�
        // limit�� ���� ��� �ִ밪�� ������ ��Ʈ�� ȥ�� Ÿ����
        // ���� ���� ���� �ּҰ��� �ִ밪 ���� ��Ʈ�� Ž
        // ���� ���� ��쿡�� �ּҰ��� �ε����� �ϳ��� ���� ��Ŵ
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
