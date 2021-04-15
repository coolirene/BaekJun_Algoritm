package level3;

import java.util.Scanner;

public class Ex1_M_Table {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N>=1 && N<=9) {
			for(int j=1; j<=9; j++) {
				System.out.println(N + " * " + j +" = " +(N*j));
			}
		}
		sc.close();
	}
	
}
