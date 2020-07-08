import java.util.Scanner;

public class Problem_200708_10275 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		double[] n = new double[t];
		double[] a = new double[t];
		double[] b = new double[t];
		
		for(int i=0; i<t; i++) {
			n[i] = sc.nextDouble();
			a[i] = sc.nextDouble();
			b[i] = sc.nextDouble();
		}
		
		for(int i=0; i<t; i++) {
			double day = 0;
			double min = Math.min(a[i], b[i]);
			
			if(min%2==1) {
				day = n[i];
				System.out.println((int)day);
			}
			else {
				for(int j=0;;j++) {
					double temp = min/2;
					day++;
					if(temp<=1) {
						System.out.println((int)(n[i]-day));
						break;
					}
					else {
						min = min/4;
					}
				}
			}
		}
	}
}
