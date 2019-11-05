import java.util.ArrayList;

public class Programmers_20191105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabbaccc";
		
		System.out.println(solution(s));
	}
	
	public static int solution(String s) {
        int answer = s.length();
        int len=1; // �ڸ� ���ڿ� ����
        
        // �ڸ� ���ڿ����� ��� ���� ArrayList
        ArrayList<String> arr = new ArrayList<String>();
        
        // ���� ���ڿ� ���� ArrayList
        ArrayList<String> brr = new ArrayList<String>();

        // 1. ���ڿ��� 2�� �������� ���ڿ� ���� �ݸ�ŭ�� ���̱��� �ڸ��� ����
        // 2. �ڸ� ���ڿ����� ���Ͽ� �ߺ� ���� ����
        // 3. ����� ���ڿ��� ���� ���Ͽ� ���� ª�� ���� ���� ����
        while(len!=s.length()/2+1) {
        	int compareCnt = 0;
        	int start=0; // ���ڿ� �ڸ��� �� ���� �κ�
        	int end=len; // ���ڿ� �ڸ��� �ε���
        	int temp=1; // ���ڿ� ���� ���� ����
        	arr.clear();
        	brr.clear();
        	
        	String str=null;
        	
        	// ���ڿ��� �ڸ� ���ڿ� ���� ��ŭ �߶� ArrayList�� ����
        	for(int i=0; i<s.length()/len; i++) {
        		arr.add(s.substring(start, end));
        		start += len;
        		end += len;
        	}
        	
        	// ���̸�ŭ �ڸ��� ���� ���ڿ����� ArrayList�� ����
        	if(start<s.length()) arr.add(s.substring(start, s.length()));
        	
        	// �ڸ� ���ڿ����� ���Ͽ� ������ ���Ͽ� ArrayList�� ����
        	for(int i=0; i<arr.size(); i++) {
        		if(i==0) str = arr.get(i);
        		else {
        			if(str.equals(arr.get(i))) {
        				temp++;
        			} else {
        				if(temp>1) str = temp+str;
        				brr.add(str);
        				str = arr.get(i);
        				temp=1;
        			}
        		}
        	}
        	
        	// ������ �ε����� ���ڿ��� Ȯ���Ͽ� ����
        	if(temp>1) str = temp+str;
        	brr.add(str);
        	
        	// ����� ���ڿ� ���� Ȯ��
        	for (String string : brr) {
				compareCnt += string.length();
			}
        	
        	// ���� ����� ���ڿ��� ���̿� ���Ͽ� ª�� ���̸� ����
        	if(compareCnt < answer) answer = compareCnt;

        	len++;
        }
        
        return answer;
    }

}
