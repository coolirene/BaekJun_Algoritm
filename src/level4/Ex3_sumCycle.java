package level4;

import java.util.Scanner;

public class Ex3_sumCycle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		
		int num = n;
		int count = 0;//Cycle 
		
		do {
		n = ((n%10)*10) + ((n/10 + n%10)%10);
		
		count++;
		} while(num != n);
		
		System.out.println(count);
	}
}
