import java.util.ArrayList;

public class Programmers_20191110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {6, 10, 2};
		
		System.out.println(solution(numbers));
	}
	
	public static String solution(int[] numbers) {
        String answer = "";
        
        ArrayList<String> arr = new ArrayList<String>();
        
        // String list에 numbers 데이터를 저장
        for(int i=0; i<numbers.length; i++) {
        	arr.add(String.valueOf(numbers[i]));
        }
        
        // 람다식을 사용하여 정렬 기준 세움
        // 앞, 뒤 자리를 더하여 높은 수로 리턴
        arr.sort((o1, o2) -> (o2 + o1).compareTo(o1+o2));
        
        for(int i=0; i<arr.size(); i++) {
        	answer += arr.get(i);
        }
        
        if(answer.charAt(0) == '0') answer = "0";
        
        return answer;
    }
}
