
public class Programmers_20191108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {1,2,3,2,3};

		for(int i=0; i<prices.length; i++)
			System.out.print(solution(prices)[i] + " / ");
	}

	public static int[] solution(int[] prices) {
		int[] answer = {};
        answer = new int[prices.length];
        
        // Loop�� ���鼭 �ϳ��� ���Ͽ�
        // �� ��󺸴� ���� ��� �ε��� ��ġ�� ���Ͽ�
        // ���� �迭�� ���� �� Loop ����
        for(int i=0; i<prices.length; i++) {
        	for(int j=i+1; j<prices.length; j++) {
        		if(prices[i]>prices[j]) {
        			answer[i] = j-i;
        			break;
        		} else if(j==prices.length-1) {
        			answer[i] = j-i;
        		}
        	}
        	if(i==prices.length-1) {
        		answer[i] = 0;
        		break;
        	}
        }
        
        return answer;
    }
}
