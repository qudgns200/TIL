import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Programmers_20191025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		System.out.println(solution(participant, completion));
	}

	public static String solution(String[] participant, String[] completion) {
		ArrayList<String> arr1 = new ArrayList<String>(Arrays.asList(participant));
		ArrayList<String> arr2 = new ArrayList<String>(Arrays.asList(completion));
		
		Collections.sort(arr1);
		Collections.sort(arr2);
		
		for(int i=0; i<arr2.size(); i++) {
			if(!arr1.get(i).equals(arr2.get(i))) {
				return arr1.get(i);
			}
		}
		
		return arr1.get(arr1.size()-1);
	}
}
