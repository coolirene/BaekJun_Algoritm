package level3;

import java.io.IOException;
import java.util.Scanner;

public class Ex10_LPyramid {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<i+1; j++) {
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
		
		sc.close();
	}

}
