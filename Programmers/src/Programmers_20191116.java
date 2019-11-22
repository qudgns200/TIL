import java.util.ArrayList;
import java.util.HashMap;

public class Programmers_20191116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		
		for(String s : solution(record)) System.out.println(s);
	}
	
	public static String[] solution(String[] record) {
        String[] answer = {};
        
        // HashMap : ID�� Nickname�� ��� ���� HashMap
        // ArrayList : Enter, Leave�� ��� ���� ArrayList
        HashMap<String, String> map = new HashMap<String, String>();
        ArrayList<String> arr = new ArrayList<String>();
        
        int count=0;
        
        // �־��� String �迭�� Loop ���� �������� Split�ϰ�
        // Enter�� Leave �� �� ArrayList�� �ൿ�� ���̵� ����
        // �׸��� ���̵�� �г����� HashMap�� ����
        for(int i=0; i<record.length; i++) {
        	String[] temp = record[i].split(" ");
        	if(temp[0].equals("Enter") || temp[0].equals("Leave")) {
        		arr.add(temp[0]);
        		arr.add(temp[1]);
        		if(temp[0].equals("Enter")) {
        			map.put(temp[1], temp[2]);
        		}
        	}
        	else map.put(temp[1], temp[2]);
        }
        
        answer = new String[arr.size()/2];
        
        
        // ArrayList�� 2����(�ൿ, ���̵�)�� Answer�� �����Ͽ� ����
        for(int i=0; i<arr.size(); i+=2) {
        	if(arr.get(i).equals("Enter")) {
        		answer[count] = map.get(arr.get(i+1)) + "���� ���Խ��ϴ�.";
        	} else {
        		answer[count] = map.get(arr.get(i+1)) + "���� �������ϴ�.";
        	}
        	count++;
        }
        
        return answer;
    }
}
