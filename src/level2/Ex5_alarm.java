package level2;

import java.util.Scanner;

public class Ex5_alarm {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(H>=0 && H<=23 && M>=0 && M<=59) {
			if(H==0 && M-45<0) {
				H=23;
				M=M+60-45;
				}
			else if(H>0 && M-45<0) {
				H=H-1;
				M=M+60-45;
				}
			else
				M=M-45;
			
		}			
		System.out.println(H + " " + M);
					
		sc.close();
	}
}
