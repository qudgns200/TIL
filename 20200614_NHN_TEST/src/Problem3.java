import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] inputArr = input.split(" ");
		
		int N = inputArr[0].charAt(0) - '0';
		int G = inputArr[1].charAt(0) - '0';
		int M = inputArr[2].charAt(0) - '0';
		
		String input1 = br.readLine();
		String input2 = br.readLine();
		String[] inputArr1 = input1.split(" ");
		String[] inputArr2 = input2.split(" ");
		int[] arr1 = new int[M];
		int[] arr2 = new int[M];
		
		for(int i=0; i<M; i++) {
			arr1[i] = inputArr1[i].charAt(0) - '0';
			arr2[i] = inputArr2[i].charAt(0) - '0';
		}
		
		int gCount = -1;
		int index = M;
		while(true) {
			if(N-G == 0) break;
			else {
				for(int i=index; i>=0; i--) {
					if(arr1[i] <= N-G) {
						if(arr2[i] + N - G >= N) {
							gCount++;
							break;
						}
					}
				}
				N = N-G;
			}
		}
		if(gCount == -1) System.out.println(gCount);
		else System.out.println(gCount + 1);
		
	}

}
