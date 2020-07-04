import java.util.Scanner;

public class Problem_200704_4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int C; // Test Case
		int N; // Students
		
		Scanner scan = new Scanner(System.in);
		C = scan.nextInt();
		
		String[] result = new String[C];
		
		for(int i=0; i<C; i++) {
			N = scan.nextInt();
			int[] scoreArr = new int[N]; // N���� ������ ��� ���� �迭
			int sum = 0; // �л��� ������ �հ�
			int avg = 0; // �л��� ������ ���
			int count = 0; // ����� �Ѵ� �л��� ��
			for(int j=0; j<N; j++) {
				scoreArr[j] = scan.nextInt();
				sum += scoreArr[j]; // �հ� ���ϱ�
			}
			avg = sum/N; // ��� ���ϱ�
			for(int k=0; k<N; k++) {
				if(scoreArr[k] > avg) {
					count++; // �л��� ������ ����� ������ ī��Ʈ ����
				}
			}
			double n2 = Math.pow(10.0, 3); // �Ҽ� ��°�ڸ����� �ݿø� �ϱ� ����
			double output = (Math.round((count/(double)N*100)*n2)/n2);
			result[i] = String.format("%.3f", output) + "%";
		}
		for(int m=0; m<C; m++) {
			System.out.println(result[m]);
		}
	}
}
