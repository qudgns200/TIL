import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] inputArr = input.split(" ");
		
		int N = inputArr[0].charAt(0) - '0';
		int M = inputArr[1].charAt(0) - '0';
		int D = inputArr[2].charAt(0) - '0';
	
		input = br.readLine();
		inputArr = input.split(" ");
		
		int[] arrH = new int[inputArr.length];
		
		for(int i=0; i<inputArr.length; i++) {
			arrH[i] = inputArr[i].charAt(0) - '0';
		}
		
		if(N-M < D) System.out.println("-1");
		else {
			if(M>D) System.out.println("-1");
			else {
				if(M<D) System.out.println(D);
				else {
					for(int i=arrH.length-1; i>0; i--) {
						if(arrH[i]-arrH[i] > 1) {
							System.out.println(D);
							break;
						}
					}
					System.out.println("-1");
				}
			}
		}
	}
}
