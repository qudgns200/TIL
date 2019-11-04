import java.util.ArrayList;

public class Programmers_20191104_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4, 4, 4, 3, 3};
		System.out.println(solution(arr).length);
	}

	public static int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(arr[0]);
        for(int i=1; i<arr.length; i++) {
        	if(arr[i-1]!=arr[i]) list.add(arr[i]);
        }
        
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
        	answer[i] = list.get(i);
        }

        return answer;
	}
}
