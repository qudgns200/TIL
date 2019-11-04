import java.util.ArrayList;

public class Programmers_20191104_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 12345;
		System.out.println(solution(n).length);
	}
	
	public static int[] solution(long n) {
	      int[] answer = {};
	      ArrayList<Integer> arr = new ArrayList<Integer>();
	      
	      while(n!=0) {
	    	  arr.add((int) (n%10));
	    	  n = n/10;
	      }
	      
	      answer = new int[arr.size()];
	      for(int i=0; i<arr.size(); i++) answer[i] = arr.get(i);
	      
	      return answer;
	  }

}
