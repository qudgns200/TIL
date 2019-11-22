import java.util.ArrayList;
import java.util.Collections;

public class Programmers_20191119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location = 0;
		
		System.out.println(solution(priorities, location));
	}
	
	public static int solution(int[] priorities, int location) {
		int answer = 1;
        int loc = location;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i : priorities) arr.add(i);
        
        // �Ź� �ִ밪�� Ȯ���Ͽ�
        // ArrayList�� 0�� ���� ��
        // 1. 0�� �����Ͱ� max �� ���
        //    ��û ������ ���� ��� �״�� Loop ����
        //    �ƴ� ��� �μ� Ƚ�� �÷���, 0�� ������ ����
        //    �����Ͱ� �ϳ��� �������Ƿ� location�� ���̳ʽ�
        // 2. 0�� �����Ͱ� max�� �ƴ� ���
        //    0�� �����͸� �����Ͽ��ٰ� ArrayList�� �߰����ְ�
        //    ���� 0�� �����ʹ� ����
        //    location�� 0�̾��ٸ� ArrayList�� ���ڸ��� ����
        //    �ƴ϶�� ���̳ʽ�
        // �̷��� ������� ArrayList�� �� ������ �ݺ�
        while(!arr.isEmpty()) {
        	int max = Collections.max(arr);
        	
        	if(arr.get(0)==max) {
        		if(loc==0) break;
        		answer++;
        		arr.remove(0);
        		loc--;
        	} else {
        		int temp = arr.get(0);
        		arr.remove(0);
        		arr.add(temp);
        		if(loc==0) loc = arr.size()-1;
        		else loc--;
        	}
        }
        
        return answer;
    }

}
