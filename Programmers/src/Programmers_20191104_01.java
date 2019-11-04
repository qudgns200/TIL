
public class Programmers_20191104_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phone_number = "027778888";
		System.out.println(solution(phone_number));
	}
	
	public static String solution(String phone_number) {
	      String answer = "";
	      char[] chs = new char[phone_number.length()];
	      
	      for(int i=0; i<phone_number.length(); i++) {
	    	  if(i<phone_number.length()-4) chs[i] = '*';
	    	  else chs[i] = phone_number.charAt(i);
	      }
	      answer = String.valueOf(chs);
	      return answer;
	  }

}
