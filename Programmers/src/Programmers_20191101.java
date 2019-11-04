import java.util.Arrays;

public class Programmers_20191101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] d = {1,3,2,5,4};
		int budget = 9;
		
		System.out.println(solution(d, budget));
	}
	
	public static int solution(int[] d, int budget) {
	      int answer = 0;
	      int sum = 0;
	      Arrays.sort(d);
	      
	      for(int i=0; i<d.length; i++) {
	    	  sum = sum + d[i];
	    	  if(sum > budget) break;
	    	  else answer++;
	      }
	      return answer;
	  }
}
