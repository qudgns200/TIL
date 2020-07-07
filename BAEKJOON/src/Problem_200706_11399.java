import java.util.Arrays;
import java.util.Scanner;

public class Problem_200706_11399 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int sum = 0;
		int result = 0;
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);

		for(int i: arr) {
			sum += i;
			result += sum;
		}
		System.out.println(result);
	}
}
