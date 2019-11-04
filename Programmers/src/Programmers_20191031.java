import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Programmers_20191031 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] stages = {4,4,4,4,4};
		int n=4;
	
		int[] result = solution(n, stages);
		for (int i : result) {
			System.out.print(i + " ");
		}
 	}
	
	public static int[] solution(int N, int[] stages) {
        int[] answer = {};
        
        int i = 1;
        
        // ���������� Ŭ���� �� �ο� ��
        double count = stages.length;
        
        HashMap<Integer, Double> map = new HashMap<Integer, Double>();
        
        // stages �迭�� ���� �� stage�� �ο� ���� ã��
        // �̸� ���ο����� �����־� �������� ���
        // ���� ���ο����� Ŭ������ ������ �ο����� ����
        // ���� stage�� �ο����� ����
        while(i!=N+1) {
        	int fail=0;
        	for(int j=0; j<stages.length; j++) {
        		if(stages[j] == i) {
        			fail++;
        		}
        	}
        	// ��� stage�� ��� �ο��� ���� ���
        	// �� �ο����� 0�� �Ǿ� exception�� �߻��Ǳ⿡
        	// ���ǹ� �߰�
        	if(count<=0) map.put( i, 0.0);
        	else map.put( i, fail/count);

        	i++;
        	count = count - fail;
        }
        
        // Hashmap Value�� ����
        // List�� Hashmap key���� ���
        // comparator �Լ��� �͸��Լ��� ����Ͽ� 
        // �ش� key�鿡 ���� value�� ���Ͽ� return
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.addAll(map.keySet());
        
        Collections.sort(arr, (Comparator)(o1, o2)-> {
        	Object v1 = map.get(o1);
        	Object v2 = map.get(o2);
        	return ((Comparable) v2).compareTo(v1);
        });
        
        answer = new int[arr.size()];
        for(int k=0; k<arr.size(); k++) {
        	answer[k] = arr.get(k);
        }

        return answer;
    }
}
