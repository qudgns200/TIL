//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Problem1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String input = null;
//		String result = null;
//
//		try {
//			input = br.readLine();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		for(int i=0; i<input.length(); i=i+16) {
//			String substrString = input.substring(i, i+16);
//			for(int j=0; j<substrString.length(); j=j+4) {
//				String temp = substrString.substring(j, j+4);
//				if(result==null) result = Integer.toHexString(ToTen(temp));
//				else result += Integer.toHexString(ToTen(temp));
//			}
//			if(i<input.length()-16) result += ":";
//
//		}
//		System.out.println("result = " + result);
//	}
//	
//	public static int ToTen(String str) {
//		int sum=0;
//		int j=3;
//		for(int i=0; i<str.length(); i++) {
//			sum += (str.charAt(i) - '0')*Math.pow(2, j);
//			j--;
//		}
//		return sum;
//	}
//
//}
