
public class Programmers_20191121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int brown = 24;
		int red = 24;
		
		solution(brown, red);
	}
	
	public static int[] solution(int brown, int red) {
        int[] answer = new int[2];
        
        int carpet = brown + red;
        int m=3, n=3; // m:가로, n:세로
        
        while(true) {
        	if(carpet%n==0) {
        		m=carpet/n;
        		if(brown == m*2+(n-2)*2) {
        			answer[0] = m;
        			answer[1] = n;
        			break;
        		}
        	}
        	n++;
        }
        
        System.out.println(answer[0] + " " + answer[1]);
        
        return answer;
    }

}
