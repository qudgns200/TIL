public class Test {

	public static void main(String[] args) {
		int numbers[] = {1, 2, 3, 4, 5};
		int sum = 0, num1 = 10, num2 = 0;
		
		try {
			for(int i=0; i<numbers.length; i++) {
				sum += num1;
			}
			System.out.println(sum);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out of Bounds");
		}
		
		try {
			float result = num1 / num2;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}
	}

}
