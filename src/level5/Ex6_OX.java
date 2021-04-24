package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex6_OX {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			int count = 0;
			int sum = 0;

			for (byte bt : br.readLine().getBytes()) {
				if (bt == 'O') {
					count++;
					sum += count;
				} else
					count = 0;
			}

			sb.append(sum).append('\n');

		}
		System.out.println(sb);
	}
}