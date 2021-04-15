package level1;

import java.util.Scanner;

public class Ex5_addition {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		if(A>0 && B<10) {
		System.out.println(A+B);
		}
		
		sc.close();
	}
}
