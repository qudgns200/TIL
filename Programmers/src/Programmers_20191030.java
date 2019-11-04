
public class Programmers_20191030 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {46, 33, 33, 22, 31, 50};
		int[] arr2 = {27, 56, 19, 14, 14, 10};
		int n=6;
	
		String[] arr3 = solution(n, arr1, arr2);
		for (String i : arr3) {
			System.out.println(i);
		}
 	}

	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = {};
		answer = new String[n];
		
		// OR 비트연산자 수행
		// 문제에 맞게 1-># / 0->공백 으로 처리
		for(int i=0; i<arr1.length;i++) {
			answer[i] = String.format
					("%" + n + "s", Integer.toBinaryString(arr1[i] | arr2[i]))
							.replace("1", "#")
							.replace("0", " ");
		}
		
		return answer;
	}
}
