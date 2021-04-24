package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1_MaxMin {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int index = 0;
		int max = 0;
		int count = 0;
		int[] arr = new int[9];
		for(int i = 0; i < 9; i++) {			
			arr[i] = Integer.parseInt(br.readLine());			
		}
		
		for(int value : arr) {
			count++;
			if(value > max) {
				max = value;
				index = count;
			}
		}

		System.out.println(max);
		System.out.println(index);

	}

}
