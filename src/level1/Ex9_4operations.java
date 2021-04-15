package level1;

import java.util.Scanner;

public class Ex9_4operations {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A>1 && B<=10000) {
			
			System.out.println(A+B);
			System.out.println(A-B);
			System.out.println(A*B);
			System.out.println(A/B);
			System.out.println(A%B);
			}
		
		sc.close();
	}

}
