
public class Programmers_20191106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] heights = {1, 2, 3, 4, 5, 6, 7};
		solution(heights);
	}
	
	public static int[] solution(int[] heights) {
        int[] answer = {};
        answer = new int[heights.length];
        
        for(int i=0; i<heights.length; i++) {
        	if(i==0) answer[i] = 0;
        	else {
        		for(int j=i-1; j>=0; j--) {
        			if(heights[i]<heights[j]) {
        				answer[i] = j+1;
        				break;
        			} else answer[i] = 0;
        		}
        	}
        }
		for (int i : answer) {
			System.out.print(i + " ");
		}
        return answer;
    }
}
