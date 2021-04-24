package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3_CountOfNums {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());
		
		String strSum = String.valueOf(sum);
		int[] arr =  new int[10];
		
		for(int i = 0; i < strSum.length(); i++) {
			arr[(strSum.charAt(i)-'0')]++;
		}
		
		for(int a : arr) {
			System.out.println(a);
		}
		
	}

}
