package level1;

import java.util.Scanner;

public class Ex11_steps {

	public static void main(String[] args) {
		
		int A = 0;
		int B = 0;
		
		Scanner sc = new Scanner(System.in);				
		A = sc.nextInt();
		B = sc.nextInt();
					
		System.out.println(A*(B%10)); 
		System.out.println(A*((B%100)/10)); 
		System.out.println(A*(B/100));
		
		int a = A*(B%10);
		int b = A*((B%100)/10)*10;
		int c = A*(B/100)*100;
			
		System.out.println(a + b + c);
		
		sc.close();
	}
	
}
