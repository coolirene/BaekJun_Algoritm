package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex1_MaxMin2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int i = 0;
		int[] arr = new int[T];
		while(st.hasMoreTokens()) {
			
			arr[i] = Integer.parseInt(st.nextToken());
			i++;
		}
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[T-1]);

	}

}
