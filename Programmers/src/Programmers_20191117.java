
public class Programmers_20191117 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
				
		System.out.println(solution(n));
	}
	
	public static String solution(int n) {
	      String answer = "";
	      int remainder; // �������� �����ϱ� ���� ����
	      
	      // ���ڰ� 3���̹Ƿ� 3���� ��� �����־�
	      // �������� �ڿ��� ��� �ٿ��ְ�
	      // �������� 0�� ��� 124 ��Ģ�̹Ƿ� 4�� remainder�� ����
	      // ���� 1�� ���� �� ����
	      while(n>0) {
	    	  remainder = n%3;
	    	  n = n/3;
	    	  
	    	  if(remainder==0) {
	    		  remainder = 4;
	    		  n -= 1;
	    	  }
	    	  
	    	  answer = remainder + answer;
	      }
	      
	      return answer;
	  }

}
