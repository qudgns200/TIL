import java.util.ArrayList;

public class Programmers_20191107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] progresses = {5, 5, 5};
		int[] speeds = {21, 25, 20};
		
		System.out.println(solution(progresses, speeds).length);
		System.out.println(solution(progresses, speeds)[0]);
		System.out.println(solution(progresses, speeds)[1]);
	}
	
	public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int cnt=1; // ���� ��� ����
        int temp1 = (int) Math.ceil((100-progresses[0])/speeds[0]); // ���� ���� �� ��
        int temp2 = 0; // ���� ����� ���� ���� �� ���� �� �� �ٷ� ���� ��� ���� �� ��
        ArrayList<Integer> arr = new ArrayList<Integer>(); // ���� ��� ���� ���� list
        
        // Loop�� ���鼭 ���� ��� ���� �� ���� ���Ͽ�
        // ���� ���� �� ���� �� �� ��� cnt�� ������Ű��
        // i��° ���� �� ���� �� �� ��� list�� ����ߴ� cnt�� ����
        for(int i=1; i<progresses.length; i++) {
        	temp2 = (int) Math.ceil((100-progresses[i])/speeds[i]);
        	
        	if(temp1 >= temp2) cnt++;
        	else {
        		arr.add(cnt);
        		cnt = 1;
        		temp1 = temp2;
        	}
        	
        	if(i==progresses.length-1) arr.add(cnt);
        }
        
        // answer�� �����ϰ� list�� ������ ����
        answer = new int[arr.size()];
        for(int i=0; i<arr.size(); i++) answer[i] = arr.get(i);
        
        return answer;
    }

}
