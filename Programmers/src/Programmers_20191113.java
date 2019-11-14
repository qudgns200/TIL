import java.util.HashSet;

public class Programmers_20191113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
		
		System.out.println(solution(n, words)[0] + " / " + solution(n, words)[1]);

	}

	public static int[] solution(int n, String[] words) {
        int[] answer = {};
        answer = new int[2];
        int dupIdx=-1;
        
        // HashSet�� �̿��Ͽ� �ߺ��� �����͸� ã��
        HashSet<String> setWords = new HashSet<String>();
        for(int i=0; i<words.length; i++) {
        	boolean isDup = setWords.add(words[i]);
        
        	if(!isDup) {
        		dupIdx = i+1;
        		break;
        	}
        }
        
        // dupIdx�� -1�� �ƴϸ� �ߺ��� ���ڿ��� �����ϱ� ������
        // dupIdx�� ��� ���� �������� ��
        // 0�̸� n��° ���
        // 0�� �ƴϸ� ������ ��° ���
        if(dupIdx!=-1) {
        	int person = dupIdx%n;
        	if(person==0) {
        		answer[0] = n;
        		answer[1] = dupIdx/n;
        	} else {
        		answer[0] = person;
        		answer[1] = dupIdx/n+1;
        	}
        	// dupIdx�� -1�� ��쿡�� �ߺ����� �������� �ʱ� ������
        	// ��� ���ڿ��� loop ���� �����ձⰡ �� ����Ǿ����� Ȯ��
        } else {
        	for(int i=1; i<words.length; i++) {
        		if(words[i-1].charAt(words[i-1].length()-1) !=
        				words[i].charAt(0)) {
        			if((i+1)%n==0) {
        				answer[0] = n;
        				answer[1] = (i+1)/n;
        				break;
        			} else {
        				answer[0] = (i+1)%n;
        				answer[1] = (i+1)/n+1;
        				break;
        			}
        		} else {
        			answer[0] = 0;
    				answer[1] = 0;
        		}
        	}
        }

        return answer;
    }
}
