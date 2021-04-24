package oca;

public class OCA20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = 8;
		loop: while(result > 7) {
			result++;
			do {
				result--;
				
			} while(result > 5);
			System.out.println(result);
			break loop;
		}
		System.out.println(result);
	}

}
